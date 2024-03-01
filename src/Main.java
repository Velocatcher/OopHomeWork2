import clients.Animal;
import clients.Owner;
import clients.VeterinaryClinic;
import clients.impl.*;
import clients.workers.Doctor;
import clients.workers.Nurse;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Doctor doctore = new Doctor("Хаус", LocalDate.of(1977, 3, 21), LocalDate.of
                (2019, 10, 1), LocalDate.now(), 100000);
        Nurse nurse = new Nurse("Флоренс", LocalDate.of
                (1990, 8, 24), LocalDate.of
                (2023, 9, 13), LocalDate.now(),60000);

        Animal dog = new Dog("Бублик", 2, LocalDate.now(), new Owner());
        Animal duck = new Duck("Макдак", 5, LocalDate.now(), null);
        Animal eagle = new Eagle("Орлик", 13, LocalDate.now(), new Owner());
        Animal fish = new Fish("Немо", 3, LocalDate.now(), new Owner());
        Animal lion = new Lion("Лёва", 120, LocalDate.now(), new Owner());
        Animal penguin = new Penguin("Прапор", 12, LocalDate.now(), new Owner());
        Animal snake = new Snake("Нагайна", 30, null, null);


        VeterinaryClinic clinic = new VeterinaryClinic("Мокрый нос");

        clinic.addAnimal(dog);
        clinic.addAnimal(duck);
        clinic.addAnimal(penguin);
        clinic.addAnimal(eagle);
        clinic.addAnimal(fish);
        clinic.addAnimal(lion);
        clinic.addAnimal(snake);
        clinic.addStaff(doctore);
        clinic.addStaff(nurse);


        System.out.print("Вас приветствует клиника " );
        System.out.println(clinic);
        System.out.println();
        System.out.println("Список пациентов клиники: " + clinic.getListPatients());
        System.out.println();
        System.out.println("Из них умеющие ходить " + clinic.getGoable());
        System.out.println();
        System.out.println("Из них умеющие летать " + clinic.getFlyable());
        System.out.println();
        System.out.println("Из них умеющие плавать " + clinic.getSwimable());
        System.out.println();

        System.out.println("Персонал клиники :");
        System.out.println(clinic.getStaff());
        System.out.println();

        System.out.println("Пациент " + dog);
        doctore.doDiagnose(dog);
        nurse.Vacinate(dog);
        clinic.removeAnimal(dog);
        System.out.println("Пациент " + dog + " выписан из клиники");


    }
}
