# Lab 0 - Hello World

## Download Source Code
1. Install intellij with java
2. Clone the project to the local
```
$ git clone https://github.com/sofiazzz/java-teaching-lab.git
$ cd java-teacching-lab/p0
```
## Compile and Run
Method 1: Manually compile and run from terminal

```
$ javac com.java.lab.HelloWorld.java
$ java com.java.lab.HelloWorld
```
Method 2: Use gradle to build and run
```
$ ./gradlew clean && ./gradlew build
$ ./gradle run
```
5. Compile and run from IDE(Intellij). Find the .class file

## Finish the TODO code change (including both src and test)
1. Create your Github profile
2. Create your repo
3. Checkout your local branch and commit your change
```
$ git checkout -b my-local-branch master
$ git add .
$ git commit -m "XXX"
```
4. Change the upstream to your repo and push to remote repository
```
$ git@github.com:<your-github>/<your-repo>.git
$ git push -f origin my-local-branch:my-remote-branch
```

## Useful link
[Gradle](https://docs.gradle.org/current/userguide/what_is_gradle.html#what_is_gradle)

[Git cheat sheet](https://education.github.com/git-cheat-sheet-education.pdf)
