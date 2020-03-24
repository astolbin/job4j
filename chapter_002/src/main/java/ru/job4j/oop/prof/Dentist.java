package ru.job4j.oop.prof;

import java.time.LocalDate;

public class Dentist extends Doctor {
    public Dentist(
        String name,
        String surname,
        String education,
        LocalDate birthday,
        int experience,
        String hospital
    ) {
        super(name, surname, education, birthday, experience, hospital);
    }

    public boolean removeTooth(Pacient pacient) {
        return true;
    }
}
