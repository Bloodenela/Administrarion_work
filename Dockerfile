FROM maven:latest AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -Dmaven.test.skip=true
FROM openjdk:20
WORKDIR /app
COPY --from=builder /app/target/ProjectService.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
