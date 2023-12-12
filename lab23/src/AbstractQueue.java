public abstract class AbstractQueue implements Queue {
    protected int size;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}