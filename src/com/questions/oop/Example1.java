package com.questions.oop;

import java.util.regex.Pattern;

public class Example1 {
    public static final String comma = ",";
    protected static String dot = ".";

    public static void main(String[] args) {
        Example1 example = new Example1();
        example.dot =":";
        System.out.println(example.comma);
        System.out.println(example.dot);
        System.out.println(Example1.dot);
    }
}
