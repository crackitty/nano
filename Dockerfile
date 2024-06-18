FROM open-liberty:latest

WORKDIR /app

COPY ./target/nano.war /config/apps
