package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Mark Elliot Zuckerberg");
        student.setEnrollment(LocalDate.of(2002, 9, 1));
        student.setGroup(3);

        System.out.printf(
            "%s was enrolled on %s in group %d",
            student.getFio(),
            student.getEnrollment().format(DateTimeFormatter.ISO_DATE),
            student.getGroup()
        );
    }
}
