package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenCountFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
    }

    @Test
    public void whenCountFromTenToTwentyThenNinety() {
        Counter counter = new Counter();
        int result = counter.add(10, 20);
        assertThat(result, is(90));
    }

    @Test
    public void whenCountFromTenToOneThenNull() {
        Counter counter = new Counter();
        int result = counter.add(10, 1);
        assertThat(result, is(0));
    }
}