import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConverter {
    public static List<String> arrayToList(String[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static List<Integer> arrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"Cat", "Book", "Tea"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println("String List: " + stringList);

        int[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = arrayToList(intArray);
        System.out.println("Integer List: " + intList);
    }
}