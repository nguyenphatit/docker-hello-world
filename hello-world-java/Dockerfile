FROM maven:3.8.2-jdk-8 AS stage

WORKDIR /home/app

COPY . /home/app

RUN mvn -f /home/app/pom.xml clean package

# Create an Image
FROM openjdk:8-jdk-alpine

EXPOSE 8080

COPY --from=stage /home/app/target/hello-world-java.jar hello-world-java.jar

ENTRYPOINT [ "sh", "-c", "java -jar /hello-world-java.jar" ]