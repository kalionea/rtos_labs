import java.util.LinkedList;

public class HashTable {
    private static final int SIZE = 10;
    private LinkedList<Entry>[] table;

    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void add(String key, String value) {
        int index = hash(key);
        LinkedList<Entry> entries = table[index];
        for (Entry e : entries) {
            if (e.key.equals(key)) {
                e.value = value;
                return;
            }
        }
        entries.add(new Entry(key, value));
    }

    public String lookup(String key) {
        int index = hash(key);
        for (Entry e : table[index]) {
            if (e.key.equals(key)) {
                return e.value;
            }
        }
        return null;
    }

    public void delete(String key) {
        int index = hash(key);
        table[index].removeIf(e -> e.key.equals(key));
    }

    private int hash(String key) {
        return key.hashCode() % SIZE;
    }

    private static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

