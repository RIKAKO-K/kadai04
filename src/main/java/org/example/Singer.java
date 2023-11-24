package org.example;

import java.time.LocalDate;

public class Singer {

    private final String name;
    private final String gender;
    private final int age;

    public Singer(String name,String gender,int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public Integer getAge() {
        return age;
    }


}
