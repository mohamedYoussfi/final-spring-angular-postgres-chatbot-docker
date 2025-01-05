# Build Stage
#FROM openjdk:21 AS builder
#WORKDIR /opt/app
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#COPY ./src ./src
#RUN ./mvnw clean package -DskipTests

# Run Stage
#FROM openjdk:21 AS final
#WORKDIR /opt/app
#EXPOSE 8080
#ENV DB_URL=jdbc:postgresql://pgdb:5432/myDbStore
#COPY --from=builder /opt/app/target/backend*.jar /opt/app/app.jar
#COPY src/main/resources /opt/app/src/main/resources
#CMD java -jar
#ENTRYPOINT ["java","-jar","-Dspring.datasource.url=${DB_URL}",  "/opt/app/app.jar"]

FROM openjdk:21-oracle
VOLUME /tmp
COPY target/*.jar  app.jar
EXPOSE 8074
ENTRYPOINT ["java","-jar", "app.jar"]