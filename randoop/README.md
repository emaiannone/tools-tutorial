# Randoop

## Installing Randoop 4.3.2 from command line (Unix-like)

**Requirements**:

- `Java` 8
- `git` (any version should be fine)
- `pip` (any version should be fine)

Download the JAR with **all the dependencies** from [here](https://github.com/randoop/randoop/releases/tag/v4.3.2), named `randoop-all-4.3.2.jar`. Alternatively, you can build from source by calling the following commands from the terminal:

```sh
git clone -b "v4.3.2" --single-branch --depth 1 https://github.com/randoop/randoop
cd randoop
pip install html5validator
./gradlew build -x check
```

After `./gradlew` ends (might take ~10 minutes), the JAR with all the dependencies, i.e., `randoop-all-4.3.2.jar`, can be found in the `build/libs` directory. Move it in your workspace and make sure it works correctly:

```sh
mv randoop-all-4.3.2.jar <DIR_YOU-LIKE>
cd <DIR_YOU-LIKE>
java -cp randoop-all-4.3.2.jar randoop.main.Main
```

Note: since the Randoop JAR is **not executable**, so we have to explicitly add the JAR in the classpath and call the fully-qualified name of the class containing the `main()` method.

## Running Randoop 4.3.2 from command line (Unix-like)

**Requirements**:

- `Java` 8
- A `junit` command-line launcher (in the following, [JUnit Platform Console Standalone 1.9.2](https://mvnrepository.com/artifact/org.junit.platform/junit-platform-console-standalone/1.9.2) is used)
- The project to test is compiled (see the [prerequirements](../README.md)).

Run Randoop generation indicating the class which we want to generate the tests for.

```sh
java -cp <PATH-TO>/randoop-all-4.3.2.jar:<PROJECT-CP> randoop.main.Main gentests --testclass=<CLASS-FQN> --time-limit=20 --junit-output-dir=randoop-tests
```

Note: `<PROJECT-CP>` must point to the base directory where all `.class` files of the project under test are stored, e.g., `target/classes`. The target class must be **instantiable**, i.e., need at least one accessible constructor.

After Randoop ends, the generated tests are stored in the current working directory under `randoop-tests/`. Generally, we should see two type of test suites:

- `RegressionTest.java`, invoking the test methods in `RegressionTest*.java` files (each has no more than 500 test methods). These tests have regression assertions, i.e., they pass when generated, useful for creating a regression test suite for working code.
- `ErrorTest.java`, invoking the test methods in `RegressionTest*.java` files (each has no more than 500 test methods). These tests have failure-revealing assertions, i.e., they fail when generated, meant to catch common bugs, like equality reflexivity, expected exceptions, etc. (for more detail, see [here](https://randoop.github.io/randoop/manual/dev.html#checks)). If none is generated, it means that Randoop couldn't find any bug (this doesn't mean the code is free from bugs).

The tests must be compiled before they can be used. EvoSuite tests require JUnit 4+ and Hamcrest 1.3+. You can either manually download them from the Maven Central Repository (e.g., [JUnit 5.9.1](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.9.1), [Hamcrest 2.2](https://mvnrepository.com/artifact/org.hamcrest/hamcrest/2.2)). Alternatively, you can re-use the dependencies that are already used by the project under test, so that both existing tests and Randoop's tests will use the exact same dependencies. If the project under test is Maven-based, we can use:

```sh
mvn dependency:copy-dependencies -DincludeArtifactIds=junit,junit-jupiter,hamcrest,hamcrest-core
```

This command will look for dependencies named `junit`, `junit-jupiter`, `hamcrest`, or `hamcrest-core` that the project use and copy them into `target/dependency`. We take notes of the ones successfully copied (in this example, the tested project uses JUnit 5.9.1 and Hamcrest 2.2). Now, we can compile all the Randoop test files using the appropriate classpath:

```sh
javac $(find randoop-tests -name "*.java") -cp <PROJECT-CP>:<PATH-TO>/randoop-all-4.3.2.jar:<PATH-TO>/junit-jupiter-5.9.1.jar:<PATH-TO>/hamcrest-2.2.jar
```

The resulting `.class` files will be stored in the same directory of the source files (`randoop-tests/`). Now, we can run the generated tests using a JUnit launcher. For example, with JUnit 5 we can use:

```sh
java -cp randoop-tests:<PROJECT-CP>:<PATH-TO>/randoop-all-4.3.2.jar:<PATH-TO>/junit-platform-console-standalone-1.9.2.jar org.junit.platform.console.ConsoleLauncher -c <TEST-CLASS-FQN>
```

Note: if we replace `-c <TEST-CLASS-FQN>` with `--scan-class-path`, all the compiled Randoop tests will be launched at once.

It is not rare that Randoop generates "weird" tests. That is, it creates tests with many `null` objects to fill parameters list to invoke methods. This happens because Randoop will not call any method outside the class supplied with `--testclass`. Hence, we have to supply a larger list of classes. To understand which is the most suitable set of classes, we might call this:

```sh
jdeps -apionly -v -R -cp <PROJECT-CP> <CLASS-FILE-PATH> | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq > myclasses.txt
```

From this list of classes we might want to remove those uneeded, for instance all classes under `java.*`. We re-run Randoop but this time using `--classlist=myclasses.txt` instead of `--testclass=<CLASS-FQN>`. The new generated tests are noticeably different now!

**Warning**: it might happen that JUnit abruptly ends without raising any error. If we re-run JUnit using `--details verbose` we can see the last executed test and get information of why this happened. One possible reason could be the closure of certain streams affecting the behavior of JUnit, e.g., invoking the `close()` method of a `Closeable` object. In these cases, we can use `--omit-methods=close`, i.e., a regex that will not allow Randoop to call the matched methods. 

## Configuring Randoop 4.3.2 from command line (Unix-like)

Randoop can be configured with a large number of command-line options. The most important ones:

- `--testjar=myjar.jar` tells Randoop to generate tests for all the classes inside `myjar.jar`.
- `--minimize-error-test=true` tells Randoop to minimize the error revealing tests, as they are usually very long to debug. By default, this is not done.
- `--specifications=myspecs.txt` tells Randoop to generate better error-revealing tests by specifying the contracts of methods. For more details, see [here](https://randoop.github.io/randoop/manual/index.html#specifying-behavior).
- `--maxsize <NUM>` tells Randoop the maximum number of statements per test. By default, 100 is used.
- `--null-ratio <RATIO>` tells Randoop the probability of using a `null` value when objects can be placed, if it knows how to construct them. By default, 0.05 is used.
- `--testsperfile <NUM>` tells Randoop the maximum number of test methods per test file. By default, 500 is used.
- `--deterministic=true` tells Randoop to use a prefixed seed for random generators, ensuring reproducibility. By default, determinism is not guaranteed.
