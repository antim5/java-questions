package com.apps.stackwithmax1;

class MaxValueStack {
    private int stack[];
    private int idx;

    MaxValueStack() {
        stack = new int[5];
        idx = -1;
    }

    public void push(int x) {
        stack[++idx] = x;
    }

    public void pop() {
        idx--;
    }

    public void printMaxValue(){
        int maxVal = 0;
        for (int i = 0; i <= idx; i++) {
            if (stack[i] > maxVal) {
                maxVal = stack[i];
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
