package ru.job4j.oop.prof;

import org.junit.Test;
import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BuilderTest {
    @Test
    public void testMakeSystemProject() {
        Builder builder = new Builder(
            "Mike",
            "Peers",
            University.STANFORD,
            LocalDate.of(1975, 6, 17),
            15,
            Company.BAM
        );

        Project project = builder.makeSystemProject();
        assertThat(project, instanceOf(Project.class));
    }

    @Test
    public void testImplementSystem() {
        Builder builder = new Builder(
            "Alex",
            "Gray",
            University.DENVER,
            LocalDate.of(1980, 11, 12),
            13,
            Company.ACS
        );

        Project project = new Project();
        boolean result = builder.buildObject(project);

        assertThat(result, is(true));
    }
}