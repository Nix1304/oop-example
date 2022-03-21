set PATH="C:\Program Files\Java\jdk-17.0.1\bin"
javac -encoding utf8 -d "classes" src/*.java src/api/*.java src/main/*.java
jar cfve mdk.jar Main -C classes/ .
