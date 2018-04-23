package com.olebas.shildt.interf;

public class AnotherClient implements Callback {

    public void callback(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
