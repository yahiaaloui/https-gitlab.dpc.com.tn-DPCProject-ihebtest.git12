FROM tomcat
USER root
COPY  /home/idts-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
CMD ["catalina.sh","run"]
