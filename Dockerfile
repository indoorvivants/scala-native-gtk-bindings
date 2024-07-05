FROM ubuntu@sha256:2e863c44b718727c860746568e1d54afd13b2fa71b160f5cd9058fc436217b30

RUN apt update && apt-get install -y libgtk-4-dev libadwaita-1-dev libgirepository1.0-dev curl && \
    curl -Lo llvm.sh https://apt.llvm.org/llvm.sh && \
    chmod +x llvm.sh && \
    apt install -y lsb-release wget software-properties-common gnupg autopoint libtool git && \
    ./llvm.sh 17 && \
    apt install libclang-17-dev &&  \
    apt install -y gpg wget && \
    wget -qO - https://packages.adoptium.net/artifactory/api/gpg/key/public | gpg --dearmor | tee /etc/apt/trusted.gpg.d/adoptium.gpg > /dev/null && \
    echo "deb https://packages.adoptium.net/artifactory/deb $(awk -F= '/^VERSION_CODENAME/{print$2}' /etc/os-release) main" | tee /etc/apt/sources.list.d/adoptium.list && \
    apt update && apt install -y temurin-17-jdk && \
    curl -Lo /usr/local/bin/sbt https://raw.githubusercontent.com/sbt/sbt/1.10.x/sbt && chmod +x /usr/local/bin/sbt 

WORKDIR /tmp-source

COPY build.sbt . 
COPY project/build.properties project/build.properties
COPY project/plugins.sbt project/plugins.sbt

RUN sbt update

ENV LLVM_BIN=/usr/lib/llvm-17/bin

WORKDIR /source
ENTRYPOINT ["sbt", "bindgenGenerateAll"]
