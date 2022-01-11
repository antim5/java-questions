package com.questions.concurrency;

public class Example4 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Example4 e1 = new Example4();
        e1.start();
        e1.setDaemon(true);
    }
}
