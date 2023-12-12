public class ArrayQueue extends AbstractQueue {
    private Object[] elements;
    private int head;
    private int tail;

    public ArrayQueue() {
        elements = new Object[10];
    }

    @Override
    public void enqueue(Object element) {
        ensureCapacity();
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    private void ensureCapacity() {
        if (size < elements.length) return;
        Object[] newElements = new Object[2 * elements.length];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(head + i) % elements.length];
        }
        elements = newElements;
        head = 0;
        tail = size;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object value = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return value;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }
}