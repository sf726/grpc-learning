# syntax=docker/dockerfile:1

FROM openjdk:11-alpine3.13

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

EXPOSE 8080
EXPOSE 8083

CMD ["./mvnw", "spring-boot:run"]
