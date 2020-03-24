package ru.job4j.oop.prof;

import org.junit.Test;
import java.time.LocalDate;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class SurgeonTest {
    @Test
    public void testSurgeonDiagnose() {
        Surgeon surgeon = new Surgeon(
            "David",
            "Gail",
            University.JHONS_HOPKINS,
            LocalDate.of(1980, 9, 24),
            12,
            Hospital.CLEVELAND_CLINIC
        );

        Diagnose diagnose = surgeon.getDiagnose(new Pacient());
        assertThat(diagnose, instanceOf(Diagnose.class));
    }

    @Test
    public void testSurgeonOperate() {
        Surgeon surgeon = new Surgeon(
            "Adam",
            "Smith",
            University.GEORGETOWN,
            LocalDate.of(1970, 3, 12),
            15,
            Hospital.MAYO_CLINIC
        );

        boolean result = surgeon.operate(new Pacient());
        assertThat(result, is(true));
    }
}