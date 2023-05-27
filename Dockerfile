FROM openjdk:17-ea-jdk-oracle
MAINTAINER faiyaz
COPY target/ExceptionHandlingDemo-0.0.1-SNAPSHOT.jar ExceptionHandlingDemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ExceptionHandlingDemo-0.0.1-SNAPSHOT.jar"]