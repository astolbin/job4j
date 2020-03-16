package ru.job4j.oop;

public class Reduce {
    private int[] array;

    public void to(int[] input) {
        array = input;
    }

    public void print() {
        for (int index : array) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
