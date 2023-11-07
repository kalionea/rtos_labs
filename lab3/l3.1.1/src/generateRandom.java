import java.util.Arrays;
import java.util.Random;

public class generateRandom {

    public static void main(String[] args) {
        int size = 10;


        double[] arrayMath = new double[size];
        for (int i = 0; i < size; i++) {
            arrayMath[i] = Math.random() * 100;
        }
        System.out.println("Массив с использованием Math.random(): " + Arrays.toString(arrayMath));

        Arrays.sort(arrayMath);
        System.out.println("Отсортированный массив с использованием Math.random(): " + Arrays.toString(arrayMath));


        Random random = new Random();
        double[] arrayRandom = new double[size];
        for (int i = 0; i < size; i++) {
            arrayRandom[i] = random.nextDouble() * 100;
        }
        System.out.println("Массив с использованием класса Random: " + Arrays.toString(arrayRandom));

        Arrays.sort(arrayRandom);
        System.out.println("Отсортированный массив с использованием класса Random: " + Arrays.toString(arrayRandom));
    }
}