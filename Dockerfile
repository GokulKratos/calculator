FROM openjdk:22
EXPOSE 8000
ADD target/calculator-service.jar calculator-service.jar
ENTRYPOINT ["java","-jar","/calculator-service.jar"]