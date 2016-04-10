# Roppa API Backend

Lightweight Java API Backend

### Prerequisities

If you want to run this project you need to install Docker Engine. If you use a Mac or Windows platform Docker Toolbox is the recommended solution.

```
Java 8+
Docker Engine - https://docs.docker.com/engine/installation/#installation
```

### Installing

A step by step series of examples that tell you have to get a development env running

Use Docker CLI and build this project by using Gradle

```
$ ./gradlew build buildDocker
```

And you can run it like this

```
$ docker run -p 8080:8080 -t y1sh/roppa-api-backend
```

The application is then available on http://localhost:8080. When using a Mac, you must visit the IP address in DOCKER_HOST instead of localhost. In this case, application is available on http://DOCKER_HOST_IP_ADDRESS:8080

## Built With

* Spring Boot
* Docker
* Gradle
