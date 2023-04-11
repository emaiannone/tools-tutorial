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
java -cp <PATH-TO>/randoop-all-4.3.2.jar:<PROJECT-CP> randoop.main.Main gentests --testclass=<CLASS-FQN> --time-limit=20
```

Note: `<PROJECT-CP>` must point to the base directory where all `.class` files of the project under test are stored, e.g., `target/classes`. The target class must be **instantiable**, i.e., need at least one `public` or `protected` constructor.

After Randoop ends, the generated tests are stored in the current working directory. Generally, we should see two type of test suites:

- `RegressionTest.java`, invoking the test methods in `RegressionTest*.java` files (each has no more than 500 test methods). These tests have regression assertions, i.e., they pass when generated, useful for creating a regression test suite for working code.
- `ErrorTest.java`, invoking the test methods in `RegressionTest*.java` files (each has no more than 500 test methods). These tests have failure-revealing assertions, i.e., they fail when generated, meant to catch common bugs, like equality reflexivity, expected exceptions, etc. (for more detail, see [here](https://randoop.github.io/randoop/manual/dev.html#checks)). If none is generated, it means that Randoop couldn't find any bug (this doesn't mean the cose is free from bugs).

## References

- [Randoop Tutorial](https://randoop.github.io/randoop/manual/index.html/)