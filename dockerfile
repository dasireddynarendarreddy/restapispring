# Step 1: Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the JAR file from the target folder to the container
# This assumes that your JAR file is located in the target directory after you build it with Maven
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Step 4: Expose the port that the Spring Boot app will run on
EXPOSE 8080

# Step 5: Specify the command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
