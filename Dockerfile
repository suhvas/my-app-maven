FROM openjdk-8.0
COPY ./target/my-app-1.0.jar my-app.jar
CMD ["java", "-jar", "my-app.jar"]
