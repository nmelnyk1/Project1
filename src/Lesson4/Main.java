package Lesson4;

public class Main {
    public static void main (String[] args){
        Animal animal = new Animal("Some animal", 1,1,5,4);
        System.out.println(" Animal is " + animal.getName() + " animal has brain " + animal.getBrain() +
                " Size " + animal.getSize() + " Animal weifgts: " + animal.getWeight());

        Dog dog = new Dog("Jerri", 8,12,2,4,1,20,"Long and smooth");
        dog.walk();


        Fish fish = new Fish("Salmon", 5, 8, 2, 2,8);

    }
}
