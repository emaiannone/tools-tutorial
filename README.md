# Tools Tutorial

- [x] [EvoSuite](evosuite)
- [x] [Randoop](randoop)
- [x] [FindSecBugs](findsecbugs)
- [x] [OWASP Dependency Check](owaspdc)
- [ ] [OWASP Zed Attack Proxy](owaspzap)

# Prerequisites

## EvoSuite, Randoop, FindSecBugs and OWASP DC

EvoSuite, Randoop, FindSecBugs and OWASP DC requires accessing to some project files to correctly analyze it, either its compiled code (the bytecode), dependencies, or other metadata files. Hence, we must built the project before running the tools.

Assuming the project can be built with `maven`, which must be installed in your local machine:

```sh
cd <PATH-PROJECT>
mvn package -DskipTests=true
```

If the project is bundled with a Maven Wrapper file, then `maven` is not necessary to build the project and we can use the following:

```sh
cd <PATH-PROJECT>
./mvnw package -DskipTests=true
```

If the project can be built with `gradle`, which must be installed in your local machine:

```sh
cd <PATH-PROJECT>
gradle build -x check -x test
```

If the project is bundled with a Gradle Wrapper file, then `gradle` is not necessary to build the project and we can use the following:

```sh
cd <PATH-PROJECT>
./gradlew build -x check -x test
```

## OWASP ZAP

OWASP ZAP does not require accessing the project's files. It just needs a starting URL (e.g., the homepage) where the web application can be found. Hence, we must build and deploy the web application before running the tool. Since there is not standard way to do so, we recommend to choose a web application you know how to serve or follow the README of the application. We suggest using one of the followings:

- [OWASP VWAD](https://github.com/OWASP/OWASP-VWAD)
- [Juice Shop](https://github.com/juice-shop/juice-shop)

Assuming the chosen application is **Juice Shop**, we download its image from DockerHub and serve it on a free port, e.g., 3000:

```sh
docker pull bkimminich/juice-shop:v14.5.1
docker run --rm -p 3000:3000 bkimminich/juice-shop:v14.5.1
```