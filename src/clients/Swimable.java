package clients;

public interface Swimable {
    double swim();

    default void sound(String s){
        System.out.println("Я много кричу!");
    }

}
