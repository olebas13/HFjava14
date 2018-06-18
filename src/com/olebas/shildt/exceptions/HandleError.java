package com.olebas.shildt.exceptions;

import java.util.Random;

public class HandleError {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на нуль.");
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }
}
