class HashNode {
    String key; // El ID del juego
    Videojuego value;
    HashNode next;

    public HashNode(String key, Videojuego value) {
        this.key = key;
        this.value = value;
    }
}

public class CustomHashTable {
    private HashNode[] buckets;
    private int capacity;
    private int size;

    public CustomHashTable(int capacity) {
        this.capacity = capacity;
        this.buckets = new HashNode[capacity];
    }

    private int getBucketIndex(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void insert(String key, Videojuego value) {
        int index = getBucketIndex(key);
        HashNode head = buckets[index];

        // Actualizar si ya existe
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insertar al principio (O(1))
        HashNode newNode = new HashNode(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    public Videojuego get(String key) {
        int index = getBucketIndex(key);
        HashNode head = buckets[index];
        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }
        return null;
    }
}