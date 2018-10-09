FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift
MAINTAINER "IBM BAT Applciation Team"
COPY target/hello-world-service-0.0.1-SNAPSHOT.jar /usr/lib/
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /usr/lib/hello-world-service-0.0.1-SNAPSHOT.jar" 
