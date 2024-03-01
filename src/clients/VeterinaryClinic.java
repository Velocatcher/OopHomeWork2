package clients;

import clients.workers.Doctor;
import clients.workers.Nurse;
import clients.workers.Workers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VeterinaryClinic {
    private final String clinicName;


    private final List<Workers> staff;
    private final List<Animal> listPatients;

    public VeterinaryClinic(String clinicName) {
        this.clinicName = clinicName;
        this.listPatients = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    public void addStaff(Workers worker){
        staff.add(worker);
    }

    public void fireStaff(Workers worker){
        staff.remove(worker);
    }

    public void addAnimal(Animal animal){
        listPatients.add(animal);
    }
    public void removeAnimal(Animal animal){
        listPatients.remove(animal);
    }


    public List<Animal> getFlyable(){
        return listPatients.stream().filter(pacient -> pacient instanceof Flyable).collect(Collectors.toList());
    }


//        for (Animal pacient : listPatients){
//        if (pacient instanceof Flyable){
//            flyable.add(pacient);
//        }
//    }
//        return flyable;


    public List<Animal> getSwimable(){
        return listPatients.stream().filter(pacient -> pacient instanceof Swimable).collect(Collectors.toList());
    }
    public List<Animal> getGoable(){
        return listPatients.stream().filter(pacient -> pacient instanceof Goable).collect(Collectors.toList());
    }
    public List<Workers> getDoctor(){
        List<Workers> result = new ArrayList<>();
        for (Workers empl : staff){
            if (empl instanceof Doctor){
                result.add(empl);
            }
        }
        return result;
    }

    public List<Workers> getNurse(){
        List<Workers> result1 = new ArrayList<>();
        for (Workers empl : staff){
            if (empl instanceof Nurse){
                result1.add(empl);
            }
        }
        return result1;
    }

    public List<Workers> getStaff() {

        return staff;
    }

    public List<Animal> getListPatients() {
        return listPatients;
    }

    public String toString(){
        return this.clinicName;
    }
}
