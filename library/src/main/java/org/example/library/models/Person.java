package org.example.library.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size (min = 2, max = 200, message = "Имя должно быть от 2 до 100 символов длиной")
    private String name;

    @Min(value = 1900, message = "Год рождения должен быть больше, чем 1900")
    private int year;

    public Person() {

    }

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
