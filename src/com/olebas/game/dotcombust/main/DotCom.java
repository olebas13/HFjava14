package com.olebas.game.dotcombust.main;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells; //ячейки, описывающие местоположение
    private String name; // имя сайта

    public void setName(String n) {
        name = n;
    }

    public void setLocationCells(ArrayList<String> loc) { //сеттер, который обновляет местоположение сайта
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + name + " :(");
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
