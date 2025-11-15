FROM eclipse-temurin:21-jre
EXPOSE 8080
ADD target/SpringBoot-jenkins-docker.jar SpringBoot-jenkins-docker.jar
ENTRYPOINT ["java","-jar","SpringBoot-jenkins-docker.jar"]