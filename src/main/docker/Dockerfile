FROM y1sh/roppa-java
MAINTAINER Seung-hwan Linus Lee "yish8213@gmail.com"
ENV APPLICATION_NAME roppa-api-backend
ENV ENVIRONMENT development
VOLUME /tmp
ADD roppa-api-backend-0.1.0.jar app.jar
RUN touch /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]