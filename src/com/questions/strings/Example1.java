package com.questions.strings;

public class Example1 {
    public static void main(String[] args) {
        String s1 = "Test", s2 = "Test";
        String s3 = new String("Test"), s4 = new String("Test");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
    }
}
