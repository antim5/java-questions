package com.questions.oop;

public class Example4 {
    int age = 5;
    Example4(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        //System.out.println(new Example4().age);
    }
}

class Example4R {
    public int age = 5;
    public static void main(String[] args) {
        System.out.println(new Example4R().age);
    }
}

