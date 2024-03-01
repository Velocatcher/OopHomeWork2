package clients.workers;

import clients.Animal;

import java.time.LocalDate;
import java.util.List;

public class Doctor extends Workers {

    public Doctor(String name, LocalDate age, LocalDate hiringDate, LocalDate fireDate, double salary) {
        super(name, age, hiringDate,fireDate,salary);
    }

    private final List<String> diagnosis = List.of("Чумка","Перелом хвоста","Насморк", "Лишай");

    public void heal(Animal animal){
        System.out.println("Доктор "+ name + "руководит лечением " + animal.getType() + " " + animal.getName());
    }

    public void doDiagnose(Animal animal) {
        int random = (int)(Math.random()*4);
        System.out.println("Диагноз " + animal + " - " + diagnosis.get(random));

    }

    @Override
    public String toString() {
        return "Доктор " + name ;
    }
}
