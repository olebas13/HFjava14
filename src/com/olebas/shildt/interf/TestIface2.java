package com.olebas.shildt.interf;

public class TestIface2 {

    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(44);
        c = ob;
        c.callback(44);
    }
}
