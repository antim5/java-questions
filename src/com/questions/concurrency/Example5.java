package com.questions.concurrency;

public class Example5 extends Thread {
    public void run() {
        System.out.println("Triggered");
    }
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Example5());
        //Thread.sleep(60000);
    }
}
