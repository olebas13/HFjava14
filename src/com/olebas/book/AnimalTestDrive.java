package com.olebas.book;

public class AnimalTestDrive {

    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();

        if (a.equals(c)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        list.add(a);
        list.add(c);

        System.out.println(c.getClass());
        System.out.println(c.hashCode());
        System.out.println(c.toString());
        System.out.println(a.toString());
    }
}
