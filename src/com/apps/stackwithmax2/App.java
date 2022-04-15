package com.apps.stackwithmax2;

import java.util.Stack;

class MaxValueStack {
    private Stack<Integer> stack;

    MaxValueStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public void printMaxValue(){
        int maxVal = 0;
        for (Integer val: stack) {
            if (val > maxVal) {
                maxVal = val;
            }
        }
        System.out.println(maxVal);
    }
}

class App {
    public static void main(String[] args) {
        MaxValueStack s = new MaxValueStack();
        s.push(10);
        s.push(15);
        s.printMaxValue(); // outputs: 15
        s.pop();
        s.printMaxValue(); // outputs: 10
        s.pop();
        s.push(20);
        s.push(15);
        s.printMaxValue(); // outputs: 20
    }
}
