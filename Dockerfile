FROM postgres:16
ENV LANG ja_JP.utf8

# ベースイメージの指定
FROM ubuntu:latest

# JDK 22のインストール
    RUN apt-get update && \
        apt-get install -y openjdk-22-jdk && \
        apt-get clean;

