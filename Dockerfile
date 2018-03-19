FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/graphqltest.jar /graphqltest/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/graphqltest/app.jar"]
