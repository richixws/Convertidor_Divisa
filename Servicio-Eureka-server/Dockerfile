FROM openjdk:8-jdk-alpine
EXPOSE 8761 
VOLUME /tmp
ADD ./target/Servicio-Eureka-server-0.0.1-SNAPSHOT.jar Eureka-server.jar
ENTRYPOINT ["java","-jar","/Eureka-server.jar"]