FROM maven:3.8.6 AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN mvn -e pom.xml clean package

FROM openjdk:17
COPY --from=build /workspace/target/*.jar customer-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","customer-service.jar"]