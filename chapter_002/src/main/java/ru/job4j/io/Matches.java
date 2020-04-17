package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        System.out.println("Игра 11.");
        Scanner input = new Scanner(System.in);
        int result = 11;
        int step = 1;
        boolean gameContinue = true;
        while (gameContinue) {
            int playerIndex = step % 2 == 0 ? 2 : 1;
            System.out.print("Игрок " + playerIndex + ", введите число от 1 до 3: ");
            int number = Integer.parseInt(input.nextLine());
            result -= number;
            System.out.println("Осталось: " + result);
            if (result < 1) {
                System.out.println("Игрок " + playerIndex + " выиграл");
                gameContinue = false;
            }
            step++;
        }
    }
}
