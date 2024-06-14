# Use a suitable base image for Java 21
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build context into the container
ARG JAR_FILE=build/libs/cards-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} cards-0.0.1-SNAPSHOT.jar

# Specify the command to run your application
CMD ["java", "-jar", "cards-0.0.1-SNAPSHOT.jar"]