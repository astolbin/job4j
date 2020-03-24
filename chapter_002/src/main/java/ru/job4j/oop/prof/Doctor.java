package ru.job4j.oop.prof;

import java.time.LocalDate;

public class Doctor extends Profession {
    private String hospital;

    public Doctor(
        String name,
        String surname,
        String education,
        LocalDate birthday,
        int experience,
        String hospital
    ) {
        super(name, surname, education, birthday, experience);
        this.hospital = hospital;
    }

    public Diagnose getDiagnose(Pacient pacient) {
        return new Diagnose();
    }

    public String getHospital() {
        return hospital;
    }
}
