package com.olebas.game.dotcombust.main;

import java.util.ArrayList;

public class DotComBust {

    // Объявляем и инициализируем переменные, которые нам понадобятся
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        // Создаем 3 объекта DotCom, даем им имена и помещаем в ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        // Выводим краткие инструкции для пользователя
        System.out.println("Ваша цель - потопить три \"сайта\".");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComsList) { // Повторяем за каждым объектом DotCom в списке
            ArrayList<String> newLocation = helper.placeDotCom(3); // Запрашиваем у воспомогательного объекта адрес сайта
            dotComToSet.setLocationCells(newLocation); //Вызываем сеттер из объекта DotCom, чтобы передать ему местоположение, которое только что получилиот воспомогательного объекта
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {  // До тех пор, пока список объектов Dotcom не станет пустым
            String userGuess = helper.getUserInput("Сделайте ход"); // Получаем пользовательский ввод
            checkUserGuess(userGuess); // Вызываем метод checkUserGuess
        }
        finishGame();
    }

    private void finishGame() {
        // Выводим сообщение о том, как пользователь прошел игру
        System.out.println("Все \"сайты\" ушли ко дну! Ваши акции теперь ничего не стоят.");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток.");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули.");
        } else {
            System.out.println("Это у вас заняло довольно много времени. " + numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++; // инкрементируем количество попыток, которые сделал пользователь
        String result = "Мимо"; // Подразумеваем промах, пока не выяснили обратного
        for (DotCom dotComToTest : dotComsList) { // Повторяем это для всех объектов DotCom в списке
            result = dotComToTest.checkYourself(userGuess); // Просим DotCom проверить ход пользователя
            if (result.equals("Попал")) {
                break; // Выбираемся из цикла раньше времени, нет смысла проверять другие "сайты"
            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest); // Ему пришел конец, так что удаляем его из списка сайтов и выходим из цикла
                break;
            }
        }
        System.out.println(result); //Выводим для пользователя результат
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust(); //Создаем игровой объект
        game.setUpGame(); // Говорим игровому объекту подготовить игру
        game.startPlaying(); // Говорим игровому объекту начать игровой цикл
    }

}
