FROM tomcat
USER root
COPY  idts-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
CMD ["catalina.sh","run"]
