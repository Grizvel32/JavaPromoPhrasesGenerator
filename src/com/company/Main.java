package com.company;

public class Main {

    public static void main(String[] args) {
        PromoPhrasesGenerator promoPhrasesGenerator = new PromoPhrasesGenerator();
        int action = -1;
        boolean isRun = true;

        while (isRun) {

            ConsoleHelper.PrintMessage("Меню:");
            ConsoleHelper.PrintMessage("1. Вывести новую фразу");
            ConsoleHelper.PrintMessage("0. Выход");

            action = ConsoleHelper.InputInt("Введите номер пункта меню: ", 0, 1);

            switch (action){
                case 1:{
                    try {
                        String phrase = promoPhrasesGenerator.getRandomPhrase();
                        ConsoleHelper.PrintMessage(phrase);
                    } catch (Exception e) {
                        ConsoleHelper.PrintMessage(e.getMessage());
                    }
                }
                break;
                case 0: {
                    isRun = false;
                }
                break;
            }
        }
    }
}
