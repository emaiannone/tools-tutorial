# OWASP Dependency Check (DC)

## Installing OWASP DC 8.2.1 from command line (Unix-like)

**Requirements**:

- `Java` 8
- `Maven` 3.5+
- `git` (any version should be fine)

Download the standalone tool from [here](https://github.com/jeremylong/DependencyCheck/releases/tag/v8.2.1) and unpack the zip into your workspace.

Alternatively, build it from source calling the following commands from the terminal:

```sh
git clone -b "v8.2.1" --single-branch --depth 1 https://github.com/jeremylong/DependencyCheck
cd DependencyCheck
mvn -s settings.xml install -DskipTests=true
```

After `mvn install` ends (should not take long), the entire tool can be found in `cli/target/release/`. Move this directory in your workspace and make sure the tool works correctly:

```sh
mv cli/target/release/ <DIR_YOU-LIKE>
cd <DIR_YOU-LIKE>
./release/bin/dependency-check.sh
```

## Running OWASP DC 8.1.2 from command line (Unix-like)

**Requirements**:

- `Java` 8

Make sure the project to analyze is compiled. For Maven-based projects, you can use:

```sh
cd <PATH-PROJECT>
mvn package -DskipTests=true
```

Run OWASP DC analysis, indicating the project directory (where the `.jar` and `.war` files can be found):

```sh
./release/bin/dependency-check.sh -s <PROJECT-DIR>
```

OWASP DC has a cold start phase, where it will download the CVE data into `data/` directory (~150 MB). This phase might take some minutes. By default, the results are exported as a HTML page written in the current directory.

If we inspect the report we can find the list of dependencies affected by known vulnerabilities. The list can be empty, but we can still inspect the full list of dependencies. Here we notice that also **test** dependencies (e.g., Junit, Hamcrest) and JARs containing the source have been analyzed. We have no specific options to avoid these analyses, but we can tell it to ignore certain JAR files using patterns. For instance:

```sh
./release/bin/dependency-check.sh -s <PROJECT-DIR> --exclude **/*-sources.jar --exclude **/*-tests.jar --exclude **/junit*.jar -exclude **/hamcrest*.jar
```

## Configuring OWASP DC 8.1.2 from command line (Unix-like)

OWASP DC can be configured with a large number of command-line options (full list [here](https://jeremylong.github.io/DependencyCheck/dependency-check-cli/arguments.html)). The most interesting are:

- `-n` tells OWASP DC to do not update the local CVE registry. 
- `--purge` tells OWASP DC to delete the local CVE registry.
- `--cveValidForHours <HOURS>` tells OWASP DC to update the local CVE registry once every `<HOURS>` instead of every four hours (default).
- `-f <FORMAT>` tells OWASP DC to change the export format. Can be XML, JSON, CSV, and other. It can produce the export in multiple format.
