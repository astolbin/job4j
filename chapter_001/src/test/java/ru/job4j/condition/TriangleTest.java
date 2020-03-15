package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {

    @Test
    public void whenExist() {
        Triangle triangle = new Triangle(
            new Point(0, 0),
            new Point(0, 2),
            new Point(2, 0)
        );

        double expected = 2.0;
        double result = triangle.area();

        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenNotExist() {
        Triangle triangle = new Triangle(
            new Point(0, 0),
            new Point(0, 2),
            new Point(0, 4)
        );

        double expected = -1;
        double result = triangle.area();

        Assert.assertEquals(expected, result, 0.01);
    }
}