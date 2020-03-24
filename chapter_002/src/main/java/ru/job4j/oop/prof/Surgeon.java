package ru.job4j.oop.prof;

import java.time.LocalDate;
import java.util.Date;

public class Surgeon extends Doctor {
    public Surgeon(
        String name,
        String surname,
        String education,
        LocalDate birthday,
        int experience,
        String hospital
    ) {
        super(name, surname, education, birthday, experience, hospital);
    }

    public boolean operate(Pacient pacient) {
        return true;
    }
}
