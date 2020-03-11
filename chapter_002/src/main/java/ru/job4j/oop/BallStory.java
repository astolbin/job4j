package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();

        Hare hare = new Hare();
        hare.tryEat(ball);
        showStatus(ball);

        Fox fox = new Fox();
        fox.tryEat(ball);
        showStatus(ball);

        Wolf wolf = new Wolf();
        wolf.tryEat(ball);
        showStatus(ball);
    }

    private static void showStatus(Ball ball) {
        if (ball.getEatCount() == 3) {
            System.out.println("Еhe ball was eaten. The end.");
        } else {
            System.out.println("The ball ran away.");
        }
    }
}
