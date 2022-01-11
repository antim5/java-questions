package com.questions.concurrency;

public class Example2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Example2 example = new Example2();
        //example.start();
    }
}
