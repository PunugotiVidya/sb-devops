FROM eclipse-temurin
EXPOSE 8093
WORKDIR /app
COPY /target/sb-devops.jar app.jar
ENTRYPOINT ["java","-jar","sb-devops.jar"]