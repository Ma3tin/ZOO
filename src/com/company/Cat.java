package com.company;

import java.time.LocalDate;

public class Cat extends Animal {
    private int countOfLives;

    public Cat(String name, int weight, LocalDate dateOfBirth, int countOfLives) {
        super(name, weight, dateOfBirth);
        this.countOfLives = countOfLives;
    }

    public boolean isAlive() {
        if (getCountOfLives() == 0) return false;
        else return true;
    }
    public void fallDown() {
        setCountOfLives(getCountOfLives() - 1);
    }

    @Override
    public String doASound() {
        return "Meow!";
    }

    public int getCountOfLives() {
        return countOfLives;
    }

    public void setCountOfLives(int countOfLives) {
        this.countOfLives = countOfLives;
    }
}
