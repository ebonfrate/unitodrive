FROM openjdk:17
LABEL author=”gruppo9”
RUN addgroup -S spring && adduser -S spring -G spring
VOLUME /customer-service
EXPOSE 8080
ARG DEPENDENCY=target
ADD ${DEPENDENCY}/*.jar customer-service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/customer-service.jaava","-Djava.security.egd=file:/dev/./urandom","-jar","/customer-service.jar"]