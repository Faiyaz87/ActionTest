FROM openjdk:17-ea-jdk-oracle
MAINTAINER faiyaz

ENTRYPOINT ["java","-jar","target/ExceptionHandlingDemo-0.0.1-SNAPSHOT.jar"]
