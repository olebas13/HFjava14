package com.olebas.shildt.collection;

public class Gen<T> {

    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Типом Т является " + ob.getClass().getName());
    }
}
