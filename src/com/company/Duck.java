package com.company;

import java.time.LocalDate;

public class Duck extends Animal{

    public Duck(String name, int weight, LocalDate dateOfBirth) {
        super(name, weight, dateOfBirth);
    }

    public Boolean canFly() {
        if (getWeight() <= 1.6) return true;
        else return false;
    }

    @Override
    public String doASound() {
        return "Quack!";
    }
}
