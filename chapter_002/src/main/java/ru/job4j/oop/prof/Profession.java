package ru.job4j.oop.prof;

import java.time.LocalDate;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private LocalDate birthday;
    private int experience;

    public Profession(String name, String surname, String education, LocalDate birthday, int experience) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getExperience() {
        return experience;
    }

    // @todo сделать через тесты
    // @todo прописать геттеры
    // @todo продублировать для инженеров
}
