FROM openjdk:18
MAINTAINER bulling
COPY "./target/bulling-0.0.1-SNAPSHOT.jar" "app.jar"
ENTRYPOINT ["java","-jar","app.jar"]
