package ru.job4j.oop;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int balance = money - price;

        for (int coin : COINS) {
            while ((balance >= coin) && (balance % coin >= 0)) {
                rsl[size] = coin;
                balance -= coin;
                size++;
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}
