package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Dog eats a bone");
    }


    @Override
    public double go() {
        return 10;
    }

    @Override
    public double swim() {
        return 4;
    }

    @Override
    public void sound(String s) {
        Swimable.super.sound("Гав-гав");
    }
}
