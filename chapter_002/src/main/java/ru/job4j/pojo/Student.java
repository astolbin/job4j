package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fio;
    private int group;
    private LocalDate enrollment;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public LocalDate getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(LocalDate enrollment) {
        this.enrollment = enrollment;
    }
}
