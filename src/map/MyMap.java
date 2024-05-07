package map;

import java.util.LinkedList;

public class MyMap<K, V> {

    private final LinkedList<Entry<K, V>>[] buckets;
    private static final int DEFAULT_CAPACITY = 16;

    public MyMap() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value) {
        int hashcode = key.hashCode();
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        if(bucket.isEmpty()) {
            bucket.add(new Entry<>(key, value, hashcode));
        }
        for (Entry<K, V> entry : bucket) {
            if (entry.getHashCode() == hashcode) {
                if (entry.getKey().equals(key)) {
                    entry.setValue(value);
                    return;
                }
            }

        }
        bucket.add(new Entry<>(key, value, hashcode));
    }

    public V get(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        Entry<K, V> entryToRemove = null;
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entryToRemove = entry;
                break;
            }
        }
        bucket.remove(entryToRemove);
    }

    private int getIndex(K key) {
        return key.hashCode() & (DEFAULT_CAPACITY - 1);
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;
        private int hashCode;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Entry(K key, V value, int hashCode) {
            this.key = key;
            this.value = value;
            this.hashCode = hashCode;
        }

        public int getHashCode() {
            return hashCode;
        }

        public void setHashCode(int hashCode) {
            this.hashCode = hashCode;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.get("one")); // Output: 1
        System.out.println(map.get("two")); // Output: 2
        System.out.println(map.get("three")); // Output: 3

        map.remove("two");
        System.out.println(map.get("two")); // Output: null
    }

}
