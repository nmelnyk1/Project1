package Lesson5;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Basic car");
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine());

        Ford ford = new Ford(6, "Ford Fiesta");
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.startEngine());

        Mitsubishi mitsubishi = new Mitsubishi(4, "Lancer");
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println(mitsubishi.startEngine());
    }
}