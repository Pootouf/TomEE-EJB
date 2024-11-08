FROM maven:3.8.7-openjdk-18-slim AS build

WORKDIR /tmp

COPY . .

RUN sh script.sh


FROM tomee:10.0-jre17-Semeru-ubuntu-plus AS final

#RUN mv /usr/local/tomee/webapps.dist/* /usr/local/tomee/webapps

COPY --from=build /tmp/EJB/target/*.jar /usr/local/tomee/webapps

EXPOSE 8080

ENTRYPOINT ["catalina.sh", "run"]