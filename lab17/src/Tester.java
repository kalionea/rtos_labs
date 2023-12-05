import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Display student");
            System.out.println("4. Clear list");
            System.out.println("5. Check if list is empty");
            System.out.println("6. Display all students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentList.addStudent();
                    break;
                case 2:
                    if (!studentList.isEmpty()) {
                        System.out.print("Enter index of student to remove: ");
                        int index = scanner.nextInt();
                        studentList.removeStudent(index);
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;
                case 3:
                    if (!studentList.isEmpty()) {
                        System.out.print("Enter index of student to display: ");
                        int index = scanner.nextInt();
                        studentList.displayStudent(index);
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;
                case 4:
                    studentList.clearList();
                    System.out.println("List cleared.");
                    break;
                case 5:
                    if (studentList.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        System.out.println("List is not empty.");
                    }
                    break;
                case 6:
                    if (!studentList.isEmpty()) {
                        System.out.println("List of all students: ");
                        for (var i = 0; i < studentList.students.size();i++) {
                            System.out.println("Index: " + i);
                            studentList.displayStudent(i);
                            System.out.println("--------");
                        }
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}