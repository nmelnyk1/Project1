package Lesson1;

public class MainAttributes {
    public static void main(String[] args){
        NewClass orangeCar = new NewClass();
        NewClass blueCar = new NewClass();
        NewClass redCar = new NewClass();

        orangeCar.name = "Nissan";
        blueCar.name ="Porsche";
        redCar.name = "Opel";

        System.out.println(orangeCar.name);
        System.out.println(blueCar.name);
        System.out.println(redCar.name);

    }
}
