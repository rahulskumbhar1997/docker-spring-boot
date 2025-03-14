FROM amazoncorretto:17

WORKDIR /opt

ENV MAVEN_VERSION=3.9.9
ENV MAVEN_HOME=/opt/apache-maven-${MAVEN_VERSION}
ENV MAVEN_BIN=$MAVEN_HOME/bin

RUN yum install tar wget gzip -y

RUN wget https://dlcdn.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz
RUN tar xvf apache-maven-${MAVEN_VERSION}-bin.tar.gz

ENV PATH=${MAVEN_BIN}:$PATH
RUN echo $PATH
COPY . .
RUN mvn clean package

CMD ["java", "-jar", "./target/HelloWorldApp-0.0.1-SNAPSHOT.jar"]
