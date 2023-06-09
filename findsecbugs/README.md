# FindSecBugs

## Installing FindSecBugs 1.12.0 from command line (Unix-like)

**Requirements**:

- `Java` 8
- `gradle` <7.0 (for 7.0+ see below)
- `git` (any version should be fine)

Download the standalone tool from [here](https://github.com/find-sec-bugs/find-sec-bugs/releases/tag/version-1.12.0) or build from source calling the following commands from the terminal:

```sh
git clone -b "version-1.12.0" --single-branch --depth 1 https://github.com/find-sec-bugs/find-sec-bugs
cd find-sec-bugs
cd cli
gradle packageCli
```

In case you are using a version of `gradle` beyond 7.0, the provided `build.gradle` file must be updated as it contains deprected elements (more info [here](https://stackoverflow.com/questions/23796404/could-not-find-method-compile-for-arguments-gradle)). Specifically, we have to change the following configurations:
  - `compile` -> `implementation`
  - `runtime` -> `runtimeClasspath`

Either downloaded directly or built from the terminal, the standalone tool with all the dependencies is packaged as a `.zip` file. Move it in your workspace, unpack it, ensure the script is executable and try to run it:

```sh
mv findsecbugs-cli-1.12.0.zip <DIR_YOU-LIKE>
cd <DIR_YOU-LIKE>
unzip findsecbugs-cli.zip && rm findsecbugs-cli-1.12.0.zip
chmod +x findsecbugs.sh
./findsecbugs.sh
```

## Running FindSecBugs 1.12.0 from command line (Unix-like)

**Requirements**:

- `Java` 8
- The project to test is compiled (see the [prerequirements](../README.md)).

Run FindSecBugs analysis, indicating the project directory (where the `.class` files can be found):

```sh
./findsecbugs.sh <PROJECT-DIR>
```

FindSecBugs prints the results on the `stdout`. The output is quite messy... We can also have the report in HTML format (many other formats are available):

```sh
./findsecbugs.sh -progress -html -output report.html <PROJECT-DIR>
```

We observe that FindSecBugs analyzes everything, test classes as well. We are not interested in analyzing test classes, as they might induce the tool in false alarms. We would like to exclude classes inside specific directories or with specific names. Since FindSecBug builds on top of FindBugs/SpotBugs, we can reuse its concept of [**filter files**](https://spotbugs.readthedocs.io/en/latest/filter.html), which are XML files in which we can tell the tool to exclude certain files. With the following configuration, we can exclude the classes ending their name with `tests?`. 

```xml
<FindBugsFilter>
  <Match>
    <Class name="~.*Tests?$"/>
    <Bug category="SECURITY" />
  </Match>
</FindBugsFilter>
```

We can write this content into a file named as we wish, e.g., `myexclude.xml`. Now, we can re-run FindSecBugs with this filter:

```sh
./findsecbugs.sh -progress -html -output report.html -exclude myexclude.xml <PROJECT-DIR>
```

## Configuring FindSecBugs 1.12.0 from command line (Unix-like)

FindSecBugs can be configured with a large number of command-line options. All these options come from the original FindBugs/SpotBugs (full list [here](https://spotbugs.readthedocs.io/en/latest/running.html#common-command-line-options)). The most interesting are:

- `-effort:value` tells FindSecBugs to employ more memory consuming analyses in hope of reducing the rate of false alarms. More info [here](https://spotbugs.readthedocs.io/en/latest/effort.html).
- `-low`/`-medium`/-`high` tells FindSecBugs to detect bugs of at least low, medium, or high severity, respectively. By default, `-medium` is active.
- `-xargs` tells FindSecBugs to read the list of classes/JARs/directories to analyze from `stdin`, meaning that we can supply the classes/JARs/directories and projects from a pipe, e.g., `cat listclasses.txt | ./findsecbugs -progress -html -output report.html`.
