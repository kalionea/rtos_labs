import java.util.ArrayList;
import java.util.Scanner;


class StudentList {
    ArrayList<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void addStudent() {
        Student newStudent = new Student();
        newStudent.readAttributesFromConsole();
        students.add(newStudent);
    }

    public void removeStudent(int index) {
        students.remove(index);
    }

    public void displayStudent(int index) {
        Student student = students.get(index);
        student.displayAttributes();
    }

    public void clearList() {
        students.clear();
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }


}



