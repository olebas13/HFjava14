package com.olebas.shildt.lambda;

public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст");
    }
}
