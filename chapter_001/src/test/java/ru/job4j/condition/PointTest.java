package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance1() {
        double expected = 2.0;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        double expected = 1.41;
        double out = Point.distance(3, 5, 2, 4);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        double expected = 3.0;
        double out = Point.distance(0, 2, 3, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance4() {
        double expected = 2.82;
        double out = Point.distance(4, 1, 6, 3);
        Assert.assertEquals(expected, out, 0.01);
    }
}
