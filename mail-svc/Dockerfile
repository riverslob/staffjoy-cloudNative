FROM openjdk:17-jdk-slim

COPY ./target/mail-svc-1.0.0.jar /usr/app/

WORKDIR /usr/app

#RUN sh -c 'touch mail-svc-1.0.0.jar'

EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=test", "-jar", "mail-svc-1.0.0.jar"]