FROM openjdk:21
WORKDIR /app
COPY target/cryptzox-0.0.1-SNAPSHOT.jar /app/cryptzox-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","cryptzox-0.0.1-SNAPSHOT.jar"]
CMD java -jar cryptzox-0.0.1-SNAPSHOT.jar