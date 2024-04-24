FROM maven:latest AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -Dmaven.test.skip=true
FROM amazoncorretto:8u412-al2023-jre
WORKDIR /app
COPY --from=builder /app/target/ProjectService.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
