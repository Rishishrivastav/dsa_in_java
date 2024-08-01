// Use the OpenJDK image from the Docker Hub
FROM openjdk:latest

// Set the working directory inside the container
WORKDIR /usr/src/myapp

// Copy the current directory contents into the container at /usr/src/myapp
COPY . /usr/src/myapp

// Compile the Java source file(s)
RUN javac Text.java

// Run the compiled Java class
CMD ["java", "text"]
