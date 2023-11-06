FROM anapsix/alpine-java 
LABEL maintainer="shanem@liatrio.com"
COPY /var/lib/jenkins/workspace/deploy-pipline-gitlab/target /home/idts-0.0.1-SNAPSHOT.war
CMD ["java","-jar","/home/idts-0.0.1-SNAPSHOT.war"]
