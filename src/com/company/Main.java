package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cat fatto = new Cat("Kitty", 5, LocalDate.of(2018, 12, 12), 9);
        Cat slimmo = new Cat("Jack", 1, LocalDate.of(2020, 5, 10), 1);
        fatto.fallDown();
        
        Dog bruno = new Dog("Bruno", 10, LocalDate.of(2006, 2, 2), true);
        boolean foo = bruno.isCollar();

        Duck donald = new Duck("Donald", 2, LocalDate.of(2021, 1, 8));
        donald.canFly(); // False
        donald.poop(0.8f);
        donald.canFly(); // True

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(fatto);
        animals.add(bruno);
        animals.add(donald);
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).doASound());
        }
    }
}
