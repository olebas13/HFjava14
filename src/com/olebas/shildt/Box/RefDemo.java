package com.olebas.shildt.Box;

public class RefDemo {

    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box pianobox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        pianobox = weightbox;
        vol = pianobox.volume();
        System.out.println("Объем pianobox равен " + vol);

        // System.out.println("Вес pianobox равен " + pianobox.weight);
    }
}
