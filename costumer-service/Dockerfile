FROM openjdk:17
VOLUME /customer-service
EXPOSE 8080
ADD ../customer-service-1.0-SNAPSHOT.jar customer-service-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/customer-service-1.0-SNAPSHOT.jar"]