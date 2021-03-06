package ru.job4j.oop.prof;

import java.time.LocalDate;

public class Builder extends Engineer {

    public Builder(
        String name,
        String surname,
        String education,
        LocalDate birthday,
        int experience,
        String company
    ) {
        super(name, surname, education, birthday, experience, company);
    }

    public boolean buildObject(Project project) {
        return true;
    }
}
