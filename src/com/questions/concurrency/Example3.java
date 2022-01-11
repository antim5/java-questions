package com.questions.concurrency;

public class Example3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Example3 e1 = new Example3();
        Example3 e2 = new Example3();
        e1.run();
        e2.run();
    }
}
