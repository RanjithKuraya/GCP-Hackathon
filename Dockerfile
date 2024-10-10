# Use Maven to build the application
FROM maven:3.8.4-openjdk-17 AS build
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# Use OpenJDK to run the application
FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
