FROM openjdk:8-jdk-alpine
EXPOSE 8765 
VOLUME /tmp
ADD ./target/Servicio-Zuul-Server-0.0.1-SNAPSHOT.jar servicio-api-gateway.jar
ENTRYPOINT ["java","-jar","/servicio-api-gateway.jar"]