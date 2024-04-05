FROM openjdk:17
ENV LANG ja_JP.utf8

# JDK 17のインストール
    RUN apt-get update && \
        apt-get install -y openjdk-17-jdk && \
        apt-get clean;

