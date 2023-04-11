# EvoSuite

## Installing EvoSuite 1.2.0 from command line (Unix-like)

**Requirements**:

- `Java` 8
- `Maven` 3.1+
- `git` (any version should be fine)

Download the executable JAR from [here](https://github.com/EvoSuite/evosuite/releases/tag/v1.2.0) or build from source calling the following commands from the terminal:

```sh
git clone https://github.com/EvoSuite/evosuite
cd evosuite
git checkout v1.2.0
mvn package -DskipTests=true
```

After `mvn package` ends (should not take long), the executable JAR with all the dependencies can be found in the `target/` directory. To ensure it works correctly use:

```sh
java -jar <PATH-TO>/evosuite-1.2.0.jar
```

## Running EvoSuite 1.2.0 from command line (Unix-like)

**Requirements**:

- `Java` 8
- A `junit` command-line launcher (in the following, JUnit Platform Console Standalone 1.9.2 is used)

Make sure the project to test is compiled. For Maven-based projects, you can use:
```sh
cd <PATH-PROJECT>
mvn package -DskipTests=true
```

Run EvoSuite generation, indicating the class which we want to generate the tests for.

```sh
java -jar <PATH-TO>/evosuite-1.2.0.jar -class <CLASS-FQN> -projectCP <PROJECT-CP>`
```

Note: `<PROJECT-CP>` must be the base directory where the `.class` file of the target class is stored, e.g., `target/classes`.

After EvoSuite ends, the generated tests are stored in the current working directory under `evosuite-tests`.

Now, the tests must be compiled before they can be used. EvoSuite tests require JUnit 4+ and Hamcrest 1.3+. You can either manually download them from the [Maven Central Repository](https://central.sonatype.com/) or re-use the dependencies that are already used by the project under test, so that both existing tests and EvoSuite's tests will use the exact same dependencies. If the project under test is Maven-based, we can use:

```sh
mvn dependency:copy-dependencies -DincludeArtifactIds=junit,junit-jupiter,hamcrest,hamcrest-core
```

This command will look for dependencies named `junit`, `junit-jupiter`, `hamcrest`, or `hamcrest-core` that the project use and copy them into `target/dependency`. We take notes of the ones successfully copied (in this example, the tested project uses JUnit 5.9.1 and Hamcrest 2.2). Now, we can compile all the EvoSuite test files using the appropriate classpath:

```sh
javac $(find ./evosuite-tests -name "*.java") -cp <PATH-TO>/target/classes:<PATH-TO>/evosuite-1.2.0.jar:<PATH-TO>/junit-jupiter-5.9.1.jar:<PATH-TO>/hamcrest-2.2.jar`
```

The resulting `.class` files will be stored in the same directory of the source files (`evosuite-tests`). Now, we can run the generated tests using a JUnit launcher. For example, with JUnit 5 we can use:

```sh
java -cp evosuite-tests:<PATH-TO>/target/classes:<PATH-TO>/evosuite-1.2.0.jar:<PATH-TO>/junit-platform-console-standalone-1.9.2.jar org.junit.platform.console.ConsoleLauncher -c <TEST-CLASS-FQN>
```

Note: if we replace `-c <TEST-CLASS-FQN>` with `--scan-class-path`, all the compiled EvoSuite tests will be launched at once.

## Configuring EvoSuite 1.2.0 from command line (Unix-like)

EvoSuite can be configured with a large number of command-line options and Java properties (`-Dproperty=value`). The most important ones:

- `-criterion branch` tells EvoSuite to generate tests to maximize branch coverage. By defualt, it maximizes several coverage criteria, with line coverage first.
- `-prefix it.unisa.auth` tells EvoSuite to generate tests for all the classes having `it.unisa.auth` prefix in their fully-qualified name.
- `-generateTests` tells EvoSuite to evolve individual test cases instead of entire test suites. By default, it evolves a population of test suites (i.e., `-generateSuite`).
- `-Dsearch_budget=20` tells EvoSuite to spend at most 20 seconds in generating tests. By defualt, it uses 60 seconds.
- `-Dminimize=false` tells EvoSuite not to apply test minimization, i.e., remove redundant statements that do not contribute to the overall coverage level achieved. By default, it is always done.
- `-Dassertion_strategy=all` tells EvoSuite not to reduce assertions, i.e., remove redundant assertions. By default, a mutation-based assertion generation is done.
- `-Dmax_size=20` tells EvoSuite to have as most 20 test cases in a test suite individual. By default, 100 is used.
- `-Dchromosome_length=100` tells EvoSuite to have tests cases with at most 100 statements. By default, 40 is used.

To see the full list of command-line options, we can call EvoSuite with `-h` option. To see the full list of properties, we can use the `-listParameters` option. 


## References

- [EvoSuite Tutorial](https://www.evosuite.org/documentation/tutorial-part-1/)
