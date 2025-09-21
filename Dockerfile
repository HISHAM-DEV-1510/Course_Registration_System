FROM openjdk:17-jdk-slim
WORKDIR /app
COPY out/artifacts/CourseRegistrationSystem.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
