package ru.job4j.oop.prof;

import org.junit.Test;
import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DentistTest {
    @Test
    public void testDentistDiagnose() {
        Dentist dentist = new Dentist(
            "John",
            "Doe",
            University.JHONS_HOPKINS,
            LocalDate.of(1985, 5, 19),
            10,
            Hospital.CLEVELAND_CLINIC
        );

        Diagnose diagnose = dentist.getDiagnose(new Pacient());
        assertThat(diagnose, instanceOf(Diagnose.class));
    }

    @Test
    public void testSurgeonRemoveTooth() {
        Dentist dentist = new Dentist(
            "Adam",
            "Smith",
            University.GEORGETOWN,
            LocalDate.of(1995, 8, 11),
            5,
            Hospital.MAYO_CLINIC
        );

        boolean result = dentist.removeTooth(new Pacient());
        assertThat(result, is(true));
    }
}