#FROM anapsix/alpine-java 
FROM maven:3.9.11-amazoncorretto-25
# Maintainer 
EXPOSE 8080
LABEL maintainer="Consty"
COPY target/*.jar /maven/yannick.jar
CMD ["java", "-jar","/maven/yannick.jar"]
