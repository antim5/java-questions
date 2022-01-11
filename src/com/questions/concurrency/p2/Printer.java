package com.questions.concurrency.p2;

import java.util.Arrays;
import java.util.List;

/**
 * Вот как добавляется блок синхронизации.
 * Внутри нужно указать у кого будет взят мьютекс для блокировки.
 */
class Printer {

    void print(List<String> wordsToPrint) {
        synchronized (this) {
            wordsToPrint.forEach(System.out::print);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // один объект для двух тредов
        Printer printer = new Printer();

        // создаем два треда
        Thread writer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> poem = Arrays.asList("Я ", "Writer1", " Пишу", " Письмо");
                printer.print(poem);
            }
        });
        Thread writer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> poem = Arrays.asList("Не Я ", "Writer2", " Не пишу", " Не Письмо");
                printer.print(poem);
            }
        });

        // запускаем их
        writer1.start();
        writer2.start();
    }
}

