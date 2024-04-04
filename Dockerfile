FROM postgres:16
ENV LANG ja_JP.utf8

# JDK 22のインストール
    RUN apt-get update && \
        apt-get install -y openjdk-22-jdk && \
        apt-get clean;

