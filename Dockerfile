FROM gradle:6.9-jdk11-alpine
ADD --chown=gradle . /code
WORKDIR /code
RUN gradle clean build
CMD ["gradle", "bootRun", "--stacktrace"]
