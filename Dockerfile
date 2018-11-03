FROM alpine

RUN apk update
RUN apk upgrade
RUN apk add gradle

WORKDIR /home/exercism-kotlin-answers/

COPY . ./

RUN sh _scripts/test_all.sh
