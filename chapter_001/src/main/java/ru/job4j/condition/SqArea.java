package ru.job4j.condition;

public class SqArea {
    public static void main(String[] args) {
        System.out.println(" p = 6, k = 2, s = 2, real = " + square(6, 2));
    }

    public static double square(int p, int k) {
        double Length = (p * k) / ((k + 1) * 2);
        double Height = Length / k;
        return Length * Height;
    }
}
