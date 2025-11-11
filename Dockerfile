#FROM  maven:3.8.5-openjdk:21 As build
#copy . .
#RUN mvn clean package -DskipTests
#FROM openjdk:17.0.1-jdk-slim
#WORKDIR /app
#COPY target/cryptzox-0.0.1-SNAPSHOT.jar /app/cryptzox-0.0.1-SNAPSHOT.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","cryptzox-0.0.1-SNAPSHOT.jar"]
#CMD java -jar cryptzox-0.0.1-SNAPSHOT.jar

# =============================
# 1️⃣ Build Stage
# =============================
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy project files
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build jar file (skip tests for faster build)
RUN mvn clean package -DskipTests

# =============================
# 2️⃣ Runtime Stage
# =============================
FROM eclipse-temurin:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy only the final jar from builder stage
COPY --from=build /app/target/cryptzox-0.0.1-SNAPSHOT.jar app.jar

# Expose the port Spring Boot runs on
EXPOSE 8080

# Default command
ENTRYPOINT ["java", "-jar", "app.jar"]
