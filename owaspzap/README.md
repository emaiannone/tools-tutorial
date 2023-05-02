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
docker run --rm owasp/zap2docker-stable:2.12.0 zap-baseline.py -t <START-URL>
```

We see that ZAP cannot access the application from another container, as they are meant to be isolated enviroments. To solve this, we need to create a Docker Network, which allows the various container to "be on the same network". We can connect a running container to the newly created network without stopping it. 

```sh
docker network create zapnet
docker network connect zapnet <WEB-APP-CONTAINER-ID>
```

Now, let's try to run the analyses:

```sh
docker run --rm --net zapnet owasp/zap2docker-stable:2.12.0 zap-baseline.py -t http://localhost:<WEB-APP-CONTAINER:PORT>
```

After a while we will see ZAP returns an error regarding a connection refused. Indeed, here we used `localhost`, but the web application is not served on this container, but on another one! Hence, we need the web application's container IP address:

```sh
docker inspect <WEB-APP-CONTAINER-ID> | grep "IPAddress"
```

We take note of the IP address printed on stdout, and use it to tell the ZAP container where to start crawling: 

```sh
docker run --rm --net zapnet owasp/zap2docker-stable:2.12.0 zap-baseline.py -t http://<WEB-APP-CONTAINER-IP>:<WEB-APP-CONTAINER:PORT>
```

If everything worked fine, we should see the analyses results on stdout. If you want to access the full log, we have to run the analysis through the shell:

```sh
docker run --rm --net zapnet -it owasp/zap2docker-stable:2.12.0 /bin/bash
./zap-baseline.py -t http://<WEB-APP-CONTAINER-IP>:<WEB-APP-CONTAINER:PORT>
cat /home/zap/.ZAP/zap.log
exit
```

In order to access the reports we have to mount a volume to `/zap/wrk`, which is where ZAP will write the real reports. We connect our `./zapvol` directory (create if it does not exist) to the container's directory `/zap/wrk` and grant it read and write accesses. Let's generate a report in Markdown format:

```sh
docker run -v $(pwd)/zapvol:/zap/wrk:rw --rm --net zapnet -it owasp/zap2docker-stable:2.12.0 /bin/bash
./zap-baseline.py -t http://<WEB-APP-CONTAINER-IP>:<WEB-APP-CONTAINER:PORT> -w report_md.md
exit
```

We should see the reports we generate in the mounted directory `./zapvol`.

By changing `zap-baseline.py` into `zap-full-scan.py` or `zap-api-scan.py` we can run the Full or API analyses, respectively.

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
