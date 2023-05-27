FROM openjdk:17-ea-jdk-oracle
MAINTAINER faiyaz

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","ExceptionHandlingDemo-0.0.1-SNAPSHOT.jar"]
