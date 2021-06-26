package com.java.lab;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestHelloWorld {
    @Test
    public void testPrint() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        HelloWorld instance = new HelloWorld();
        instance.print();
        Assert.assertEquals("Hello World!\n", outContent.toString());
    }

    @Test
    public void testPrintFromPerson() {
        // TODO fill out this unit test
    }
}
