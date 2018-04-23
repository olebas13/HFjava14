package com.olebas.shildt.interf;

public class TestIface {

    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(45);
    }
}
