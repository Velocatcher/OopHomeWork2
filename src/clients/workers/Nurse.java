package clients.workers;

import clients.Animal;

import java.time.LocalDate;

public class Nurse extends Workers{
    public Nurse(String name, LocalDate age, LocalDate hiringDate, LocalDate fireDate, double salary) {
        super(name, age, hiringDate,fireDate,salary);
    }

    public void Vacinate(Animal animal){
        System.out.println(animal.getType() + " " + animal.getName() + " вакцинирован сестрой " + name);
    }

    @Override
    public String toString() {
        return "Мед сестра " + name ;
    }

}
