import java.util.Scanner;


class Student {
    String name;
    int age;

    public void readAttributesFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        this.age = scanner.nextInt();
    }

    public void displayAttributes() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
