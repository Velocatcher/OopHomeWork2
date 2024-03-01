package clients.workers;

import java.time.LocalDate;

public abstract class Workers {
    protected String name;
    protected LocalDate age;
    protected LocalDate hiringDate;
    protected LocalDate fireDate;
    public double salary;
    public Workers(String name, LocalDate age, LocalDate hiringDate, LocalDate fireDate, double salary){
        this.name = name;
        this.age = age;
        this.hiringDate = hiringDate;
        this.fireDate = fireDate;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }



}
