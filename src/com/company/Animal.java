package com.company;

import java.time.LocalDate;

public class Animal {
    private String name;
    private float weight;
    private LocalDate dateOfBirth;

    public Animal(String name, int weight, LocalDate dateOfBirth) {
        this.name = name;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    public void eatUp(float weightOfFood) {
        setWeight(getWeight() + weightOfFood);
    }

    public void poop(float weightOfPoop) {
        setWeight(getWeight() - weightOfPoop);
    }

    public String doASound() {
        return "";
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
