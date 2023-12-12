public class QueueTest {
    public static void main(String[] args) {
        Queue linkedQueue = new LinkedQueue();
        Queue arrayQueue = new ArrayQueue();

        // Тестирование LinkedQueue
        System.out.println("Testing LinkedQueue");
        testQueue(linkedQueue);

        // Тестирование ArrayQueue
        System.out.println("\nTesting ArrayQueue");
        testQueue(arrayQueue);
    }

    private static void testQueue(Queue queue) {
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Добавляем элементы
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
            System.out.println("Enqueue: " + i);
        }

        // Проверяем размер и первый элемент
        System.out.println("Size after enqueues: " + queue.size());
        System.out.println("First element: " + queue.element());

        // Удаляем элементы
        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
        }

        // Проверяем пустоту очереди
        System.out.println("Is queue empty after dequeues? " + queue.isEmpty());
    }
}