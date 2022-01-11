package com.questions.oop;

interface Dockable {
    default int width(int i) {
        return 10 - i;
    }
}

public class Example6 implements Dockable {
    public int width(int i) {
        return Dockable.super.width(Dockable.super.width(i));
    }
    public static void main(String[] args) {
        System.out.println(new Example6().width(1));
    }
}
