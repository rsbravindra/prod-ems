FROM openjdk:17
WORKDIR /app
COPY target/employee-management.jar employee-management.jar
ENTRYPOINT ["java", "-jar", "employee-management.jar"]