FROM java:8
VOLUME /tmp
ADD nginx-test.jar xxx.jar
RUN sh -c "touch  xxx.jar"
ENTRYPOINT ["sh","-c","java -jar  xxx.jar"]