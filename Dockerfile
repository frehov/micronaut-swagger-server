FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/ubw-rest*.jar ubw-rest.jar
CMD java ${JAVA_OPTS} -jar ubw-rest.jar