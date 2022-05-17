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
//
//        int bananaWeight = 80;
//        int milkWeight = 105;
//        int ice_creamWeight = 100;
//        int eggWeight = 70;
//        float cocktailWeight = bananaWeight * 5 + milkWeight * 2 + ice_creamWeight * 2 + eggWeight * 4;
//        System.out.println("Вес коктейля " + cocktailWeight + " грамм, или " + cocktailWeight/1000 + " кг.");
//
//        задание 4

//        int grForDay_1 = 250;
//        int grForDay_2 = 500;
//        int targetWeight = 7000;
//        double average = targetWeight / ((grForDay_1 + grForDay_2) / 2D);
//        System.out.println("Теряя по " + grForDay_1 + " грамм, нужно: " + targetWeight/grForDay_1 + " дней.");
//        System.out.println("Теряя по " + grForDay_2 + " грамм, нужно: " + targetWeight/grForDay_2 + " дней.");
//        System.out.println("В среднем " + average + " дней.");
//
//        задание 5

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double mashaIndexing = masha * 1.1;
        double denisIndexing = denis * 1.1;
        double kristinaIndexing = kristina * 1.1;
        double differenceYearMasha = mashaIndexing * 12 - masha * 12;
        double differenceYearDenis = denisIndexing * 12 - denis * 12;
        double differenceYearKristina = kristinaIndexing * 12 - kristina * 12;
        System.out.println("Маша теперь получает " + mashaIndexing +  " Рублей. Годовой доход вырос на " + differenceYearMasha + " руб.");
        System.out.println("Денис теперь получает " + denisIndexing +  " Рублей. Годовой доход вырос на " + differenceYearDenis + " руб.");
        System.out.println("Кристина теперь получает " + kristinaIndexing +  " Рублей. Годовой доход вырос на " + differenceYearKristina + " руб.");


    }
}
