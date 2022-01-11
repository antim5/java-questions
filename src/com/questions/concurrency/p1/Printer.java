package com.questions.concurrency.p1;

import java.util.Arrays;
import java.util.List;

class Printer {

    synchronized void print(List<String> wordsToPrint) {
        wordsToPrint.forEach(System.out::print);
        System.out.println();
    }

    public static void main(String args[]) {
        // один объект для двух тредов
        Printer printer  = new Printer();

        // создаем два треда
        Writer1 writer1 = new Writer1(printer);
        Writer2 writer2 = new Writer2(printer);

        // запускаем их
        writer1.start();
        writer2.start();
    }
}

/**
 * Писатель номер 1, который пишет свою поэму.
 */
class Writer1 extends Thread {
    Printer printer;

    Writer1(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        List<String> poem = Arrays.asList("Я ", this.getName(), " Пишу", " Письмо");
        printer.print(poem);
    }

}

/**
 * Писатель номер 2, который пишет свою поэму.
 */
class Writer2 extends Thread {
    Printer printer;

    Writer2(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        List<String> poem = Arrays.asList("Не Я ", this.getName(), " Не пишу", " Не Письмо");
        printer.print(poem);
    }
}