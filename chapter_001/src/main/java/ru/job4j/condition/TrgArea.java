package ru.job4j.condition;

public class TrgArea {
    public static void main(String[] args) {
        System.out.println("area (3, 3, 3) = " + area(3, 3, 3));
    }

    public static double area(double a, double b, double c) {
        double perimeter = (a + b + c) / 2;

        return Math.sqrt(
            perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c)
        );
    }
}
