FROM gradle

ADD build.gradle /
RUN gradle clean build


