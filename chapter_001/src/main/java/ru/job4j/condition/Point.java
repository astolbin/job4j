package ru.job4j.condition;

public class Point {
    public static void main(String[] args) {
        System.out.println("result (0, 0) to (2, 0) " + distance(0, 0, 2, 0));
        System.out.println("result (3, 5) to (2, 4) " + distance(3, 5, 2, 4));
        System.out.println("result (0, 2) to (3, 2) " + distance(0, 2, 3, 2));
        System.out.println("result (4, 1) to (6, 3) " + distance(4, 1, 6, 3));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double distanceX = Math.pow(x2 - x1, 2);
        double distanceY = Math.pow(y2 - y1, 2);
        return Math.sqrt(distanceX + distanceY);
    }
}
