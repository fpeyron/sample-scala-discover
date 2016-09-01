FROM fabric8/java-alpine-openjdk8-jdk
ENV PROFILES dev
ENV JAVA_OPTS -Xmx128m -Xms128m -Deureka.instance.ip-address=192.168.99.100 -Deureka.port=8761

VOLUME /tmp

ADD sample-scala-discover.jar /app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT exec java ${JAVA_OPTS} -Dspring.profiles.active=${PROFILES} -Djava.security.egd=file:/dev/./urandom -jar /app.jar

EXPOSE 8761
