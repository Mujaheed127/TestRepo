
# Stage 1: Build the application using Maven
FROM maven:3.9.4-eclipse-temurin-17 AS builder

# Set the working directory
WORKDIR /app

# Copy the project files
COPY . .

# Build the project and skip tests
RUN mvn clean package -DskipTests

# Stage 2: Create a lightweight image to run the application
FROM eclipse-temurin:17-jdk

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the builder stage
COPY --from=builder /app/target/*.jar demo-app.jar

# Run the application
CMD ["java", "-jar", "demo-app.jar"]