FROM maven:4.0.0-jdk-22 AS builder
WORKDIR /favoriteList
COPY ./src ./src
COPY ./pom.xml .
RUN mvn package
FROM adoptopenjdk/openjdk22:debianslim-jre
COPY --from=builder /tmp/target/app.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]