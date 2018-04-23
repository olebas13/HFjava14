package com.olebas.shildt.interf;

public abstract class Incomplete implements Callback {

    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}
