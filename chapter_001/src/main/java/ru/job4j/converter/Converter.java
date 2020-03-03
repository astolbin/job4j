package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are 2 euro. Test result : " + assertEquals(2, euro));
        int dollar = rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
        System.out.println("180 rubles are 3 dollar. Test result : " + assertEquals(3, dollar));
        int rubFromEuro = euroToRuble(3);
        System.out.println("3 euro are " + rubFromEuro + " ruble.");
        System.out.println("3 euro are 210 ruble. Test result : " + assertEquals(210, rubFromEuro));
        int rubFromDollar = dollarToRuble(4);
        System.out.println("4 dollar are " + rubFromDollar + " ruble.");
        System.out.println("4 dollar are 240 ruble. Test result : " + assertEquals(240, rubFromDollar));
    }

    private static boolean assertEquals(int expected, int result) {
        return expected == result;
    }

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }
}
