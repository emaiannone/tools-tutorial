# OWASP Zed Attack proxy (ZAP)

## Installing OWASP ZAP 2.12.0 from Docker image (Unix-like)

**Requirements**:

- `docker`

Run the docker daemon (`dockerd`) and download the official image from DockerHub. Check the ID of the downloaded image and use it to run a container to check if it works correctly.

# TODO TEST on public safe URL (www.example.com)

```sh
dockerd
docker pull owasp/zap2docker-stable:2.12.0
docker run --rm owasp/zap2docker-stable:2.12.0 zap-baseline.py -t https://www.example.com
```

If everything worked correctly, we should see the output of the baseline analysis on the test website.

## Running OWASP ZAP 2.12.0 in Docker container (Unix-like)

**Requirements**:

- `docker`

Make sure the web application to test is deployed and accessible (see the [prerequirements](../README.md)).

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
docker run --net zapnet -it owasp/zap2docker-stable:2.12.0 /bin/bash
./zap-baseline.py -t http://<WEB-APP-CONTAINER-IP>:<WEB-APP-CONTAINER:PORT>
cat /home/zap/.ZAP/zap.log
exit
```

Inside `/home/zap/.ZAP/reports` there are reports in many different formats. We can transfer them into our host machine for further inpsection.

```sh
docker cp /home/zap/.ZAP/reports ./
```
