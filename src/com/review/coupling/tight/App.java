package com.review.coupling.tight;

// RectangleArea responsible for calculating square size of the specified area
class RectangleArea {
    int square;
    int perimeter; // TODO: add perimeter calculation as well

    RectangleArea(int length, int width) {
        this.square = length * width;
    }

    public void modifySides(int length, int width) {
        this.square = length * width;
    }

    public void squareWithSidesDoubled(int length, int width) {
        this.square = length * 2 * width * 2;
    }
}

class App {
    public static void main(String[] args) {
        RectangleArea area = new RectangleArea(5, 6);
        System.out.println(area.square); // outputs: 30

        area.modifySides(3, 2);
        System.out.println(area.square); // outputs: 6

        area.squareWithSidesDoubled(3, 2);
        System.out.println(area.square); // outputs: 24
    }
}
