package com.olebas.shildt.defaultmethod;

public interface MyIF {

    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
