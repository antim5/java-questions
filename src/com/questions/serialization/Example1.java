package com.questions.serialization;

import java.io.Serializable;

public class Example1 implements Serializable {
    private static int vaultNum;
    private String title;
    private String author;
    private transient int edition = 1;
}
