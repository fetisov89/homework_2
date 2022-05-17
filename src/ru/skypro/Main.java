package ru.skypro;

public class Main {
    public static void main(String[] args) {
        //         Задание 1
//        byte a = 10;
//        short b = 10;
//        int c = 10;
//        long d = 10L;
//        float e = 10.5f;
//        double f = 10;
//        char g = 1;
//        boolean x = false;

//        задание 2
//
//        float weightBoxer_1 = 78.2f;
//        float weightBoxer_2 = 82.7f;
//        System.out.println("Общий вес боксеров " + (weightBoxer_1 + weightBoxer_2) + " кг.");
//        System.out.println("Разница в весе боксеров " + (weightBoxer_2 - weightBoxer_1) + " кг.");

//        задание 3

        int bananaWeight = 80;
        int milkWeight = 105;
        int ice_creamWeight = 100;
        int eggWeight = 70;
        float cocktailWeight = bananaWeight * 5 + milkWeight * 2 + ice_creamWeight * 2 + eggWeight * 4;
        System.out.println("Вес коктейля " + cocktailWeight + " грамм, или " + cocktailWeight/1000 + " кг.");

    }
}
