FROM anapsix/alpine-java 
LABEL maintainer="shanem@liatrio.com"
COPY /target/idts-0.0.1-SNAPSHOT.war /home/idts-0.0.1-SNAPSHOT.war
CMD ["java","-jar","/home/idts-0.0.1-SNAPSHOT.war"]
