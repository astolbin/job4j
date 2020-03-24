package ru.job4j.oop.prof;

import java.time.LocalDate;

public class Engineer extends Profession {
    private String company;

    public Engineer(
        String name,
        String surname,
        String education,
        LocalDate birthday,
        int experience,
        String company
    ) {
        super(name, surname, education, birthday, experience);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public Project makeSystemProject() {
        return new Project();
    }
}
