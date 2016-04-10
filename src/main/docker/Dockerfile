FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD roppa-api-backend-0.1.0.jar app.jar
RUN touch /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]