package ru.job4j.oop.prof;

import org.junit.Test;
import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ProgrammerTest {
    @Test
    public void testMakeSystemProject() {
        Programmer programmer = new Programmer(
            "Marissa Ann",
            "Mayer",
            University.STANFORD,
            LocalDate.of(1974, 5, 30),
            15,
            Company.YAHOO
        );

        Project project = programmer.makeSystemProject();
        assertThat(project, instanceOf(Project.class));
    }

    @Test
    public void testImplementSystem() {
        Programmer programmer = new Programmer(
            "Iain",
            "Mitchell",
            University.DENVER,
            LocalDate.of(1980, 11, 12),
            13,
            Company.MICROSOFT
        );

        Project project = new Project();
        boolean result = programmer.implementSystem(project);

        assertThat(result, is(true));
    }
}