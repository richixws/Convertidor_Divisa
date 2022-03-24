FROM openjdk:8-jdk-alpine
EXPOSE 8200 
VOLUME /tmp
ADD ./target/Currency-Exchange-0.0.1-SNAPSHOT.jar cambio-divisa.jar
ENTRYPOINT ["java","-jar","/cambio-divisa.jar"]