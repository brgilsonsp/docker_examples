FROM maven:3.8.5-openjdk-11
EXPOSE 8080
COPY . /usr/src/myapp
RUN mvn -f /usr/src/myapp clean package
WORKDIR /usr/src/myapp/target
CMD ["java", "-jar", "hello-world-0.0.1.jar"]