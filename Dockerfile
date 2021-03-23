FROM amazoncorretto:11-alpine-jdk
MAINTAINER maxPiroddi
COPY  target/project-manager-0.0.1-SNAPSHOT.jar project-manager-1.0.0.jar
ENTRYPOINT ["java","-jar","/project-manager-1.0.0.jar"]
