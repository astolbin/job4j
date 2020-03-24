package ru.job4j.oop.prof;

import java.time.LocalDate;

public class Programmer extends Engineer {

    public Programmer(
        String name,
        String surname,
        String education,
        LocalDate birthday,
        int experience,
        String company
    ) {
        super(name, surname, education, birthday, experience, company);
    }

    public boolean implementSystem(Project project) {
        return true;
    }
}
