import java.util.LinkedList;

public class HashTable<K, V> {
    private int currentSize = 0;
    private int tableMaxSize;
    private LinkedList<Entry<K,V>>[] hashTable;

    public HashTable(){
        this.tableMaxSize = 16;
        this.hashTable = new LinkedList[tableMaxSize];
    }

    public HashTable(int newTableMaxSize){
        this.tableMaxSize = newTableMaxSize;
        this.hashTable = new LinkedList[tableMaxSize];
    }

    public int indexForKey(K key){
        return Math.abs(key.hashCode() % tableMaxSize);
    }

    public void put(K key, V value){
        int index = indexForKey(key);
        if(hashTable[index] == null){
            hashTable[index] = new LinkedList<Entry<K, V>>();
        }
        for(Entry<K, V> entry : hashTable[index]){
            if(entry.getKey().equals(key)){
                entry.setValue(value);
            }
        }
        hashTable[index].add(new Entry<K, V>(key, value));
        currentSize++;
    }

    public V get(K key){
        int index = indexForKey(key);
        if(hashTable[index] != null) {
            for (Entry<K, V> entry : hashTable[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public void remove(K key){
        int index = indexForKey(key);
        if(hashTable[index] != null) {
            for (Entry<K, V> entry : hashTable[index]) {
                if (entry.getKey().equals(key)) {
                    hashTable[index].remove(entry);
                    currentSize--;
                }
            }
        }
    }

    public int size(){
        return currentSize;
    }

    public boolean isEmpty(){
        return (currentSize == 0);
    }
}
