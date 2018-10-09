FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift
MAINTAINER "IBM BAT Applciation Team"
COPY target/hello-world-service-0.0.1-SNAPSHOT.jar /usr/lib/
ENV JAVA_OPTS="" 
EXPOSE 8070
