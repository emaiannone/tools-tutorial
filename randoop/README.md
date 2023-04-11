# Randoop

## Installing Randoop 4.3.2 from command line (Unix-like)

**Requirements**:

- `Java` 8
- `gradle` 7.6+
- `git` (any version should be fine)
- `pip`

Download the JAR with all the dependencies from [here](https://github.com/randoop/randoop/releases/tag/v4.3.2), named `randoop-all-4.3.2.jar`. Alternatively, you can build from source by calling the following commands from the terminal:

```sh
git clone https://github.com/randoop/randoop
cd randoop
git checkout v4.3.2
pip install html5validator
./gradlew build -x check
```

After `./gradlew` ends (might take ~10 minutes), the JAR with all the dependencies, i.e., `randoop-all-4.3.2.jar`, can be found in the `build/libs` directory. To ensure it works correctly use:

```sh
java -cp <PATH-TO>/randoop-all-4.3.2.jar randoop.main.Main
```

Note: the JAR is not executable, so we have to explicitly add the JAR in the classpath and specify the fully-qualified name of the class with the `main()` method to invoke.

## Running Randoop 4.3.2 from command line (Unix-like)

**Requirements**:

- `Java` 8
- A `junit` command-line launcher (in the following, JUnit Platform Console Standalone 1.9.2 is used)

Make sure the project to test is compiled. For Maven-based projects, you can use:
```sh
cd <PATH-PROJECT>
mvn package -DskipTests=true
```

Run Randoop generation, indicating the class which we want to generate the tests for.

```sh
java -cp <PATH-TO>/randoop-all-4.3.2.jar:<PROJECT-CP> randoop.main.Main gentests --testclass=<CLASS-FQN> --time-limit=20, --junit-output-dir=randoop-tests
```

Note: `<PROJECT-CP>` must point to the base directory where all `.class` files of the project under test are stored, e.g., `target/classes`. The target class must be **instantiable**, i.e., need at least one accessible constructor.

After Randoop ends, the generated tests are stored in the current working directory under `randoop-tests`. Generally, we should see two type of test suites:

- `RegressionTest.java`, invoking the test methods in `RegressionTest*.java` files (each has no more than 500 test methods). These tests have regression assertions, i.e., they pass when generated, useful for creating a regression test suite for working code.
- `ErrorTest.java`, invoking the test methods in `RegressionTest*.java` files (each has no more than 500 test methods). These tests have failure-revealing assertions, i.e., they fail when generated, meant to catch common bugs, like equality reflexivity, expected exceptions, etc. (for more detail, see [here](https://randoop.github.io/randoop/manual/dev.html#checks)). If none is generated, it means that Randoop couldn't find any bug (this doesn't mean the code is free from bugs).

Now, the tests must be compiled before they can be used. Randoop tests require JUnit 4+ and Hamcrest 1.3+. You can either manually download them from the [Maven Central Repository](https://central.sonatype.com/) or re-use the dependencies that are already used by the project under test, so that both existing tests and Randoop's tests will use the exact same dependencies. If the project under test is Maven-based, we can use:

```sh
mvn dependency:copy-dependencies -DincludeArtifactIds=junit,junit-jupiter,hamcrest,hamcrest-core
```

This command will look for dependencies named `junit`, `junit-jupiter`, `hamcrest`, or `hamcrest-core` that the project use and copy them into `target/dependency`. We take notes of the ones successfully copied (in this example, the tested project uses JUnit 5.9.1 and Hamcrest 2.2). Now, we can compile all the Randoop test files using the appropriate classpath:

```sh
javac $(find randoop-tests -name "*.java") -cp <PROJECT_CP>:<PATH-TO>/randoop-all-4.3.2.jar:<PATH-TO>/junit-jupiter-5.9.1.jar:<PATH-TO>/hamcrest-2.2.jar
```

The resulting `.class` files will be stored in the same directory of the source files (`randoop-tests`). Now, we can run the generated tests using a JUnit launcher. For example, with JUnit 5 we can use:

```sh
java -cp randoop-tests:<PROJECT-CP>:<PATH-TO>/randoop-all-4.3.2.jar:<PATH-TO>/junit-platform-console-standalone-1.9.2.jar org.junit.platform.console.ConsoleLauncher -c <TEST-CLASS-FQN>
```

TODO Il fatto dei test che so strani

It is not rare that Randoop generate "weird" tests. That is, it creates tests with many `null` objects to fill parameters list to invoke methods. This happens because Randoop will not call any method outside the class supplied with `--testclass`. Hence, we have to supply a larger list of classes. To understand which is the most suitable set of classes, we might call this:

```sh
jdeps -apionly -v -R -cp <PROJECT-CP> <CLASS-FILE-PATH> | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq > myclasses.txt
```

From this list of classes we might want to remove those uneeded, for instance all classes under `java.*`. We re-run Randoop but this time using `--classlist=myclasses.txt` instead of `--testclass=<CLASS-FQN>`. The new generated tests are noticeably different now!

Note: if some 



TODO Il fatto dei metodi problemtici

## Configuring Randoop 4.3.2 from command line (Unix-like)

TODO Opzioni CLI

TODO Contratti?


```sh
java -cp ../../commons-csv/target/classes:randoop-all-4.3.2.jar randoop.main.Main gentests --classlist=myclasses.txt --time-limit=60 --junit-output-dir=randoop-tests --omit-methods=close
```

```sh
javac $(find randoop-tests -name "*.java") -cp ../../commons-csv/target/classes:randoop-all-4.3.2.jar:/home/emaia/.m2/repository/org/junit/jupiter/junit-jupiter/5.9.1/junit-jupiter-5.9.1.jar:/home/emaia/.m2/repository/org/hamcrest/hamcrest/2.2/hamcrest-2.2.jar
```

```sh
java -cp ./randoop-tests:../../commons-csv/target/classes:randoop-all-4.3.2.jar:/home/emaia/.m2/repository/org/junit/platform/junit-platform-console-standalone/1.9.2/junit-platform-console-standalone-1.9.2.jar org.junit.platform.console.ConsoleLauncher -c RegressionTest --details verbose
```

## References

- [Randoop Tutorial](https://randoop.github.io/randoop/manual/index.html/)