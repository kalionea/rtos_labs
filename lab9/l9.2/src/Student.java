public class Student {
    private int iDNumber;
    private double GPA;

    public Student(int iDNumber, double GPA) {
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}
