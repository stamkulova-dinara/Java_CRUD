package com.course.springStudents.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity //Entity-класс представляет собой описание сущности(манызы) базы данных с помощью полей Java-класса
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String fullname;
    private LocalDate birthday;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }
}
