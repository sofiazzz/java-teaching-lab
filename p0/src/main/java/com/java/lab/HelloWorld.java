package com.java.lab;

public class HelloWorld {

    public void print(String fromPerson) {
        System.out.println("Hello World from " + fromPerson);
    }
    public void print() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        HelloWorld instance = new HelloWorld();
        instance.print();
        // TODO change to use public void print(String fromPerson) to print
    }
}
