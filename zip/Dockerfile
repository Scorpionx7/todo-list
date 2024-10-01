# Etapa 1: Build da aplicação
FROM maven:3.9.4-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Criação do container para rodar a aplicação
FROM openjdk:21-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Expor a porta do Spring Boot
EXPOSE 8080

# Rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
