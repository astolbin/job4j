package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int tmp;
        int backNum;

        for (int i = 0; i < array.length / 2; i++) {
            backNum = array.length - i - 1;
            tmp = array[backNum];
            array[backNum] = array[i];
            array[i] = tmp;
        }

        return array;
    }
}
