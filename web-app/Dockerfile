FROM openjdk:17-jdk-slim

COPY ./target/web-app-1.0.0.jar /usr/app/

WORKDIR /usr/app

#RUN sh -c 'touch web-app-1.0.0.jar'

EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=test", "-jar", "web-app-1.0.0.jar"]