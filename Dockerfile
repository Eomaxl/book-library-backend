FROM openjdk:17
ADD target/library-springboot.jar library-springboot.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","library-springboot.jar"]