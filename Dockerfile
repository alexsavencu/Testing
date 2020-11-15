#Linux image we are going to use
FROM alpine
WORKDIR /root/hello-wrold
COPY /src/main/java/Lets_Test.java /root/hello-wrold

#install JDK
RUN apk add openjdk8
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $PATH:$JAVA_HOME/bin

#Compile and run
RUN javac Lets_Test.java

ENTRYPOINT java Lets_Test
