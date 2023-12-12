import java.util.Comparator;
import java.util.PriorityQueue;

public class HashTableTest {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        // Добавление 10 элементов
        for (int i = 0; i < 10; i++) {
            hashTable.add("key" + i, "value" + i);
        }

        // Поиск и удаление элемента
        String keyToSearch = "key5";
        System.out.println("Value found: " + hashTable.lookup(keyToSearch));
        hashTable.delete(keyToSearch);
        System.out.println("Value after deletion: " + hashTable.lookup(keyToSearch));

        // Тест приоритетной очереди
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(10, Comparator.reverseOrder());

        // Добавление 10 элементов
        for (int i = 0; i < 10; i++) {
            priorityQueue.add(i);
        }

        // Извлечение и вывод значений
        for (int i = 0; i < 3; i++) {
            if (!priorityQueue.isEmpty()) {
                System.out.println(priorityQueue.poll());
            }
        }
    }
}