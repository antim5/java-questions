package com.questions.errors;

import java.io.IOException;

public class Example2 {
    public static void main(String args[]) {
        try {
            throw new IOException("Test");
        } catch (Error e) {
            System.out.println("1");
        } catch (Throwable e) {
            System.out.println("2");}
/*        } catch (IOException e) {
            System.out.println("3");
        }*/
        System.out.println("0");
    }
}

