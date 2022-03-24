FROM openjdk:8-jdk-alpine
EXPOSE 8100 
VOLUME /tmp
ADD ./target/Conversion-Moneda-0.0.1-SNAPSHOT.jar conversion-moneda.jar
ENTRYPOINT ["java","-jar","/conversion-moneda.jar"]