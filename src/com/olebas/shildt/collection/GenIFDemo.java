package com.olebas.shildt.collection;

public class GenIFDemo {

    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iOb = new MyClass<Integer>(inums);
        MyClass<Character> cOb = new MyClass<Character>(chs);

        System.out.println("Максимальное значение в массиве inums: " + iOb.max());
        System.out.println("Минимальное значение в массиве inums: " + iOb.min());

        System.out.println("Максимальное значение в массиве chs: " + cOb.max());
        System.out.println("Минимальное значение в массиве chs: " + cOb.min());
    }
}
