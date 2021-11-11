package com.company;

import java.time.LocalDate;

public class Dog extends Animal {
    private Boolean collar;

    public Dog(String name, int weight, LocalDate dateOfBirth, Boolean collar) {
        super(name, weight, dateOfBirth);
        this.collar = collar;
    }

    public Boolean isCollar() {
        return getCollar();
    }

    @Override
    public String doASound() {
        return "Bark!";
    }

    public Boolean getCollar() {
        return collar;
    }

}
