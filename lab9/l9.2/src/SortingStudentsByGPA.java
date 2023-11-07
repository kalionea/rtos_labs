import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGPA(), s1.getGPA());
    }

    // Реализация быстрой сортировки
    public void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);

            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private int partition(Student[] students, int low, int high) {
        Student pivot = students[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (compare(students[j], pivot) < 0) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }
    public static void main(String[] args) {
        var sorter = new SortingStudentsByGPA();

        Student[] students = {
                new Student(1, 4.98),
                new Student(2, 4.37),
                new Student(3, 4.45)
        };
        System.out.println("Before");
        for (Student s : students) {
            System.out.println("ID: " + s.getIDNumber() + ", GPA: " + s.getGPA());
        }
        sorter.quickSort(students, 0, 2);
        System.out.println("After");
        for (Student s : students) {
            System.out.println("ID: " + s.getIDNumber() + ", GPA: " + s.getGPA());
        }
    }
}
