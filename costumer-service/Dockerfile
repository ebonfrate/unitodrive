FROM openjdk:17
LABEL author=”gruppo9”
RUN addgroup -S spring && adduser -S spring -G spring
VOLUME /costumer-service
EXPOSE 8080
ARG DEPENDENCY=target
ADD ${DEPENDENCY}/*.jar costumer-service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/costumer-service.jar"]