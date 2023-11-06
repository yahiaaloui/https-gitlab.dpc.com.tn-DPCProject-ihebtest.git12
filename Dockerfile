
FROM java:8-jre-alpine 
VOLUME /tmp 
ADD /target/idts-0.0.1-SNAPSHOT.war app.jar 

RUN sh -c 'touch /app.jar' 
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=prod", "-jar", "/app.jar"] 

EXPOSE 8888
