#/app /usr /lib
####### STAGE: DEV ######
FROM openjdk:17-alpine

LABEL org.opencontainers.image.authors="Christian David Bacilio <cbaciliodc@gmail.com>"

ARG JAR_FILE=target/*.jar

COPY $JAR_FILE app.jar

ENV ENV_JAR_FILE=$JAR_FILE \
    TZ="America/Lima"

#ENTRYPOINT ["java", "-Xms512m", "-Xmx2048m", "-XX:MaxRAM=2048m", "-XX:MaxMetaspaceSize=2048m", "-XX:+CMSClassUnloadingEnabled", "-XX:+UseG1GC", "-XX:+OptimizeStringConcat", "-XX:+UseStringDeduplication", "-XX:+UseLWPSynchronization", "-Djavax.xml.accessExternalDTD=all", "-jar", "/app.jar"]
ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 8000