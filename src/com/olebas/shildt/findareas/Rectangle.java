package com.olebas.shildt.findareas;

public class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}
