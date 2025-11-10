# Etapa de build con Maven
FROM maven:3.9.3-eclipse-temurin-17 AS build

WORKDIR /app

# Copiamos pom y src
COPY pom.xml .
COPY src ./src

# Build del proyecto
RUN mvn clean package -DskipTests

# Etapa final: solo JDK
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copiamos el JAR desde la etapa build
COPY --from=build /app/target/*.jar app.jar

# Comando para correr la app
CMD ["java", "-jar", "app.jar"]
