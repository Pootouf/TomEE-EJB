FROM maven:3.8.7-openjdk-18-slim AS build

WORKDIR /tmp

COPY . .

RUN bash script.sh


FROM tomee:10.0-jre17-Semeru-ubuntu-plus AS final

#RUN mv /usr/local/tomee/webapps.dist/* /usr/local/tomee/webapps


EXPOSE 8080

ENTRYPOINT ["catalina.sh", "run"]