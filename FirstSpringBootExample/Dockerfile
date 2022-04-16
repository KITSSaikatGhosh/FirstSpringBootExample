FROM java:8
VOLUME /tmp1
ADD target/firstspringbootexample.war app.war
RUN sh -c 'touch /app.war'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.war" ]