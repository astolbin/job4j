package ru.job4j.strategy;

import java.util.StringJoiner;

public class Square implements Shape {
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());

        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                pic.add("+++++");
            } else {
                pic.add("+   +");
            }
        }

        return pic.toString();
    }
}
