package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Penguin extends Animal implements Swimable, Goable {
    public Penguin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Penguin eats fish");
    }

    @Override
    public double swim() {
        return 4;
    }

    @Override
    public double go() {
        return 1.5;
    }
}
