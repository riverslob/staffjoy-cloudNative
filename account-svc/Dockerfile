FROM openjdk:17-jdk-slim

COPY ./target/account-svc-1.0.0.jar /usr/app/

WORKDIR /usr/app

#RUN sh -c 'touch account-svc-1.0.0.jar'

EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=test", "-jar", "account-svc-1.0.0.jar"]