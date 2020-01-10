package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        if (finish < 2) {
            return false;
        }

        boolean prime = true;

        for (int i = 2; i <= finish; i++) {
            if (i < finish && finish % i == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}
