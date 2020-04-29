package ru.job4j.strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new Paint().draw(new Square());

        assertThat(
            new String(out.toByteArray()),
            is(
                new StringJoiner(System.lineSeparator())
                    .add("+++++")
                    .add("+   +")
                    .add("+   +")
                    .add("+   +")
                    .add("+++++")
                    .add(System.lineSeparator())
                    .toString()
            )
        );

        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new Paint().draw(new Triangle());

        assertThat(
            new String(out.toByteArray()),
            is(
                new StringJoiner(System.lineSeparator())
                    .add("   +  ")
                    .add("  + + ")
                    .add(" +   +")
                    .add("+++++++")
                    .add(System.lineSeparator())
                    .toString()
            )
        );

        System.setOut(stdout);
    }
}