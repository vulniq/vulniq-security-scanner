FROM ubuntu:bionic-20200112

COPY src/main/resources/unit-test-xml/support /tmp/support

RUN apt-get update && apt-get install -y libapt-pkg-dev net-tools apache2
SHELL ["/bin/bash", "-c"]

