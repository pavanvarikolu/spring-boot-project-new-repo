# define base docker file image
FROM openjdk:17
LABEL maintainer="pavan kalyan"
ADD target/spring-boot-project-new-0.0.1-SNAPSHOT.war spring-boot-project-new.war
ENTRYPOINT [ "java", "-jar", "/spring-boot-project-new.war" ]
