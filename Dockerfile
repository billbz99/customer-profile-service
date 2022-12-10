# define base docker image
FROM openjdk:11
LABEL maintainer="billb"
ADD build/libs/jpa-demo-0.0.1-SNAPSHOT-plain.jar springboot-docker-demo.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]



#FROM container-registry.ubs.net/ubs/gbdevops/docker-base-image-openjdk-1.17:master-SNAPSHOT
#ENV DEBIAN_FRONTEND=noninteractive

#ENV APP_VERSION=0.0.1-SNAPSHOT
#ARG JAR_FILE=target/customer-profile-service-${APP_VERSION}.jar
#WORKDIR /usr/app/customerprofileservice
#COPY ${JAR_FILE} app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","app.jar"]


#Dockerfile in devops
#FROM container-registry.ubs.net/ubs/gbdevops/docker-base-image-openjdk-1.17:master-SNAPSHOT
#VOLUME /tmp
#EXPOSE 8080
#COPY target/*.jar app.jar
#ENTRYPOINT ["jar","-jar","app.jar"]