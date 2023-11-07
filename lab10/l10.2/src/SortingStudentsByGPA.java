import java.util.*;

public class SortingStudentsByGPA {

    private ArrayList<Student> students;

    public SortingStudentsByGPA() {
        this.students = new ArrayList<Student>();
    }

    // 1) Заполнение массива
    public void setArray(int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int idNumber = random.nextInt(1000); // генерируем случайный ID
            double GPA = 2.5 + random.nextDouble() * 2.5; // генерируем случайный GPA между 2.5 и 5.0
            students.add(new Student(idNumber, GPA));
        }
    }

    // 2) Метод для сортировки по среднему баллу студентов
    public void quicksort() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGPA(), s1.getGPA());
            }
        });
    }

    // Альтернативный метод сортировки слиянием
    public void mergeSort() {
        students = new ArrayList<Student>(MergeSortStudents.mergeSort(students));
    }

    // 3) Метод для вывода массива студентов
    public void outArray() {
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", GPA: " + student.getGPA());
        }
    }

    // 4) Возможность сортировать список студентов по другому полю (ID в данном случае)
    public void sortByID() {
        students.sort(Comparator.comparingInt(Student::getIDNumber));
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(10); // создаем 10 студентов
        System.out.println("Before sorting:");
        sorter.outArray();

        sorter.quicksort(); // сортируем по GPA
        System.out.println("\nAfter quick sorting by GPA:");
        sorter.outArray();

        sorter.sortByID(); // сортируем по ID
        System.out.println("\nAfter sorting by ID:");
        sorter.outArray();

        sorter.mergeSort(); // альтернативная сортировка по GPA
        System.out.println("\nAfter merge sorting by GPA:");
        sorter.outArray();
    }
}