package com.lynn;


import org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;

public class ArrayMap<K, V> implements Map61B<K,V>, Iterable<K> {
    private K[] keys;
    private V[] values;
    int size;

    public ArrayMap(){
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    private int keyIndex(K key){
        for(int i = 0; i < size; i++){
            if(keys[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public boolean containsKey(K key){
        return keyIndex(key) > -1;
    }

    public V get(K key){
        int i = keyIndex(key);
        if(i > -1 ){
            return values[i] ;
        }

        throw new IllegalArgumentException("the key provided " + key +" was not in ArrayMap.");
    }

    public int size(){
        return size;
    }

    public void put(K key, V value){
        int i = keyIndex(key);
        if( i > -1){
            values[i] = value;
            return;
        }

        keys[size] = key;
        values[size] = value;
        size += 1;
        return;
    }

    public List<K> keys(){
        List<K> keylist = new ArrayList<K>();
        for(int i = 0; i < keys.length; i++){
            keylist.add(keys[i]);
        }
        return keylist;
    }


    public class KeyIterator implements Iterator{

        private int wizardPosition;

        public KeyIterator(){
            wizardPosition = 0;
        }

        public boolean hasNext(){
            return wizardPosition < size;
        }

        public K next(){
            K keyValue = keys[wizardPosition];
            wizardPosition += 1;
            return keyValue;
        }
    }

    public Iterator<K> iterator(){
        return new KeyIterator();
    }


    @Test
    public void test(){
        ArrayMap<Integer, Integer> am = new ArrayMap<>();
        am.put(2,5);
        int expected = 5;
        assertEquals((Integer) expected, am.get(2));
    }




    public static void main(String[] args) {
        ArrayMap<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);
    }

}
