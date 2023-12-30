public class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K newKey, V newValue){
        this.key = newKey;
        this.value = newValue;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V newValue){
        this.value = newValue;
    }
}
