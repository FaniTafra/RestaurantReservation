FROM alexvoliveira/apiweb:28bbfb089a6db4e758927d4a4aec4843b24b9e36
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]