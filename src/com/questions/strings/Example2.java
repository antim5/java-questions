package com.questions.strings;

public class Example2 {
    final static String s1 = null;
    public static void main(String[] args) {
        final String s1 = "Test";
        System.out.println(Example2.s1 == "Test");
        System.out.println(Example2.s1.equals("Test"));
    }
}
