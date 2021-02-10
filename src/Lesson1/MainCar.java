package Lesson1;

public class MainCar {
public static void main(String[] args) {

    Car car1 = new Car(5, "Nissan");
    Car car2 = new Car(6, "Porsche");


    System.out.println("My car is " + car1.getName());
    System.out.println("My car's age  is " + car1.getAge());
}
}
