# Use a suitable base image for Java 21
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build context into the container
ARG JAR_FILE=build/libs/loans-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} loans-0.0.1-SNAPSHOT.jar

# Specify the command to run your application
CMD ["java", "-jar", "loans-0.0.1-SNAPSHOT.jar"]