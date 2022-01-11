package com.questions.errors;

public class Example1 {
    Example1 getA() {
        return this;
    }
    Example1 getB() {
        return null;
    }
    Example1 getC() {
        return new Example1();
    }
    public static void main(String[] args) {
        Example1 example1 = new Example1().getA().getB().getC();
    }
}
