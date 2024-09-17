FROM maven:3.9.9-eclipse-temurin-22 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests
FROM alexvoliveira/apiweb:28bbfb089a6db4e758927d4a4aec4843b24b9e36
WORKDIR /app
COPY --from=builder /app/target/*.jar application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]