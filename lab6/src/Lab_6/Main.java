package Lab_6;

public class Main {
    public static void main(String[] args) {
        Nameable car = new Car("Ferrari");
        Nameable animal = new Animal("Elephant");

        System.out.println("Lab_6.Car name: " + car.getName());
        System.out.println("Lab_6.Animal name: " + animal.getName());
    }
}