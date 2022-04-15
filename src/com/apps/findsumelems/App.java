package com.apps.findsumelems;

import java.util.HashMap;

class ElemsPairFinder {
    private final int[] elems;
    private final HashMap<Integer, Integer> elemsMap;

    ElemsPairFinder(int[] input) {
        elems = input;
        elemsMap = new HashMap<>();
        for (int i = 0; i < elems.length; i++) {
            elemsMap.put(elems[i], i);
        }
    }

    public void printElemsForSum(int targetSum) {
        for (int i = 0; i < elems.length; i++) {
            int targetElem = targetSum - elems[i];
            if (elemsMap.containsKey(targetElem)) {
                System.out.printf(
                        "%d (idx: %d) + %d (idx: %d) = %d\n",
                        elems[i], i, targetElem, elemsMap.get(targetElem), targetSum);
                return;
            }
        }
        System.out.println("none");
    }
}

public class App {
    public static void main(String[] args) {
        ElemsPairFinder finder = new ElemsPairFinder(new int[]{2, -4, 10, 19});

        finder.printElemsForSum(6); // outputs: -4 (idx: 1) + 10 (idx: 2) = 6
        finder.printElemsForSum(-2); // outputs: 2 (idx: 0) + -4 (idx: 1) = -2
        finder.printElemsForSum(0); // outputs: none
    }
}
