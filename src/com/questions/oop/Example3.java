package com.questions.oop;

public class Example3 {
    void print(){
        System.out.println("A");
    }
    public static void main(String[] args) {
        new Example3().print();
        new Example3C().print();
    }
}
class Example3C extends Example3{
    protected void print(){
        System.out.println("B");
        super.print();
    }
}

