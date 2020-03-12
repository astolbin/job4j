package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance1() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);

        double expected = 2.0;
        double out = a.distance(b);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        Point a = new Point(3, 5);
        Point b = new Point(2, 4);

        double expected = 1.41;
        double out = a.distance(b);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        Point a = new Point(0, 2);
        Point b = new Point(3, 2);

        double expected = 3.0;
        double out = a.distance(b);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance4() {
        Point a = new Point(4, 1);
        Point b = new Point(6, 3);

        double expected = 2.82;
        double out = a.distance(b);

        Assert.assertEquals(expected, out, 0.01);
    }
}
