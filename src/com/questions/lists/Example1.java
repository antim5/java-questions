package com.questions.lists;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> symbols = new ArrayList<>();
        symbols.add("A");
        symbols.add("B");
        symbols.add("C");
        symbols.add("D");
        symbols.sort((a, b) -> {
            return (int) b.charAt(0) - (int) a.charAt(0);
        });
        for (int i = 0; i < symbols.size(); i++) {
            System.out.println(symbols.get(++i));
        }
    }
}
