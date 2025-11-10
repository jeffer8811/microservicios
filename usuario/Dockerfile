# Dockerfile para usuario o matricula
FROM maven:3.9.3-eclipse-temurin-17 AS build

WORKDIR /app

# Copia archivos
COPY pom.xml .
COPY src ./src

# Construye el proyecto
RUN mvn clean package -DskipTests

# Imagen final
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]