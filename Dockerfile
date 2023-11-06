FROM openjdk
COPY target/*.jar /
EXPOSE 8088
ENTRYPOINT ["java","-jar","/idts-0.0.1-SNAPSHOT.war"]
