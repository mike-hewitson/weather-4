FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/weather-4.jar /weather-4/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/weather-4/app.jar"]
