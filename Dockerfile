FROM openjdk:20
ADD /target/ProjectService.jar backend.jar
ENTRYPOINT ["java","-jar", "backend.jar"]
