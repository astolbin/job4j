package ru.job4j.strategy;

public class Paint {
    public static void main(String[] args) {
        Paint paint = new Paint();

        paint.draw(new Square());
        paint.draw(new Triangle());
    }

    public void draw(Shape shape) {
        System.out.println(shape.draw());
        System.out.println();
    }
}
