package clients.impl;

import clients.Animal;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Snake extends Animal implements Swimable {

    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Snake eats mouse");
    }


    @Override
    public double swim() {
        return 2;
    }
}
