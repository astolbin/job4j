package ru.job4j.oop;

public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("load Tiger");
    }

    public Tiger(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Tiger predator = new Tiger("789");
    }
}
