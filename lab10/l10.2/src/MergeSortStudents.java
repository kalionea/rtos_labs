import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {

    public static List<Student> mergeSort(List<Student> students) {
        if (students.size() <= 1) {
            return students;
        }

        List<Student> left = new ArrayList<>();
        List<Student> right = new ArrayList<>();
        int middle = students.size() / 2;

        for (int i = 0; i < middle; i++) {
            left.add(students.get(i));
        }

        for (int i = middle; i < students.size(); i++) {
            right.add(students.get(i));
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).getIDNumber() < right.get(rightIndex).getIDNumber()) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        while (leftIndex < left.size()) {
            result.add(left.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex < right.size()) {
            result.add(right.get(rightIndex));
            rightIndex++;
        }

        return result;
    }
}
