# OWASP Zed Attack proxy (ZAP)

## Installing OWASP ZAP 2.12.0 from Docker image (Unix-like)

**Requirements**:

- `docker`

Run the docker daemon (`dockerd`) and download the official image from DockerHub. Check the ID of the downloaded image and use it to run a container to check if it works correctly.

```sh
dockerd
docker pull owasp/zap2docker-stable:2.12.0
docker run --rm owasp/zap2docker-stable:2.12.0 zap-baseline.py -t https://www.example.com
```

If everything worked correctly, we should see the output of the baseline analysis on the test website.

## Running OWASP ZAP 2.12.0 in Docker container (Unix-like)

**Requirements**:

- `docker`
- The web application to test is deployed and accessible (see the [prerequirements](../README.md)).

Run OWASP ZAP Baseline Scan indicating the web application starting URL:

```sh
docker run --rm owasp/zap2docker-stable:2.12.0 zap-baseline.py -t  http://localhost:<WEB-APP-PORT>
```

By changing `zap-baseline.py` into `zap-full-scan.py` or `zap-api-scan.py` we can run the Full or API analyses, respectively.

We observe that ZAP cannot access the application from another container, as they are meant to be isolated enviroments. To solve this, we need to create a Docker Network, which allows the various container to "be on the same network". We can connect a running container to the newly created network without stopping it. 

```sh
docker network create zapnet
docker network connect zapnet <WEB-APP-CONTAINER-ID>
```

If we try again we will see we have the same error. The problem so lies in `localhost`, which represents the ZAP container, not the web application's container. Hence, we either , but on another one! We can either replace `localhost` with the web application's container ID or find its IP address using:

```sh
docker inspect <WEB-APP-CONTAINER-ID> | grep "IPAddress"
```

In either cases, we correct the URL like this:

```sh
docker run --rm --net zapnet owasp/zap2docker-stable:2.12.0 zap-baseline.py -t http://<WEB-APP-CONTAINER-ID-OR-IP>:<WEB-APP-PORT>
```

If everything worked fine, we should see the analyses results on stdout. If we want to access the log, we have to retrieve the file `/home/zap/.ZAP/zap.log` inside the ZAP container. We can do something like this:

```sh
docker run --rm --net zapnet -it owasp/zap2docker-stable:2.12.0 /bin/bash
./zap-baseline.py -t http://<WEB-APP-CONTAINER-IP>:<WEB-APP-CONTAINER:PORT>
cat /home/zap/.ZAP/zap.log
exit
```

The log is not a detailed report. To have it, we have to mount a volume attacked to `/zap/wrk`, which is the directory where ZAP will export the real reports. We connect a local directory of ours, e.g., called  `zapvol` to the container's directory `/zap/wrk` and grant it read and write accesses. Let's generate a report in Markdown format:

```sh
docker run -v $(pwd)/zapvol:/zap/wrk:rw --rm --net zapnet -it owasp/zap2docker-stable:2.12.0 /bin/bash
./zap-baseline.py -t http://<WEB-APP-CONTAINER-IP>:<WEB-APP-CONTAINER:PORT> -w report_md.md
exit
```

When ZAP ends, we should see the reports directly inside the directory `zapvol` in our working directory.

## Configuring OWASP ZAP 2.12.0 in Docker container (Unix-like)

OWASP ZAP packaged scans (not to be confused with the [command-line](https://www.zaproxy.org/docs/desktop/cmdline/) of ZAP itself) can be configured with a large number of command-line options (full list [here](https://www.zaproxy.org/docs/desktop/cmdline/)). The most interesting are:

- `-r <html_file>` tells ZAP to export into an HTML file called `<html_file>`.
- `-w <md_file>` tells ZAP to export into a Markdown file called `<md_file>`.
- `-x <xml_file>` tells ZAP to export into a XML file called `<xml_file>`.
- `-J <json_file>` tells ZAP to export into a JSON file called `<json_file>`.
- `-m <mins>` tells ZAP to spend `<mins>` minutes during the crawling (the default depends on the scan).
- `-j` tells ZAP to use the Ajax spider in addition to the traditional one.
- `--hook <hook_file>` tells ZAP the Python file containing the customized scan hooks.
- `-z <zap_options>` tells ZAP the command-line options to forward to the base CLI tool.

Full list depends on the individual scans:

- [Baseline Scan](https://www.zaproxy.org/docs/docker/baseline-scan/)
- [Full Scan](https://www.zaproxy.org/docs/docker/full-scan/)
- [API Scan](https://www.zaproxy.org/docs/docker/api-scan/)
