# syntax=docker/dockerfile:1

FROM openjdk:11-jre-slim

COPY target/demo-0.0.1-SNAPSHOT.jar /helloworld.jar

ENTRYPOINT java -jar helloworld.jar