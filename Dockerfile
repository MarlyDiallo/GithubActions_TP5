FROM openjdk:17-ea-17-jdk-slim-buster


COPY target/projettp1.jar projettp1.jar

ENTRYPOINT ["java","-jar","projettp1.jar"]

EXPOSE 8080
