import java.util.Arrays;
import java.util.Stack;

public class InvertArrayUsingStack {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(array));

        invertArray(array);
        System.out.println("Inverted Array: " + Arrays.toString(array));
    }

    public static <T> void invertArray(T[] array) {
        Stack<T> stack = new Stack<>();
        for (T element : array) {
            stack.push(element);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }
}