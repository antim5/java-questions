package com.questions.oop;

// this one fails
class Example40 {
    int age = 5;

    Example40(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println(
                new Example40().age
        );
    }
}

// this one is ok
class Example41 {
    public int age = 5;

    public static void main(String[] args) {
        System.out.println(
                new Example41().age
        );
    }
}

