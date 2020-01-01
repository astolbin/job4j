package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenMax1() {
        int result = SqMax.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax2() {
        int result = SqMax.max(3, 4, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax3() {
        int result = SqMax.max(2, 3, 4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax4() {
        int result = SqMax.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMaxFew() {
        int result = SqMax.max(4, 4, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenNoMax() {
        int result = SqMax.max(4, 4, 4, 4);
        assertThat(result, is(4));
    }
}