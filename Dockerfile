FROM postgres:16
ENV LANG ja_JP.utf8

# DockerfileにJDKをインストールするための記述
FROM maven:3.8.3-openjdk-17-slim AS build

RUN apt-get update && \
    apt-get install -y openjdk-17-jdk