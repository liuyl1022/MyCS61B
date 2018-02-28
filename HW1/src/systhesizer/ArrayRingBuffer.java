package systhesizer;

import java.io.IOException;
import java.lang.Exception;

public class ArrayRingBuffer<T> extends AbstractBoundedQueue<T> {
    int first;
    int last;
    T[] arrayRing;


    public void AbstractBoundedQueue(int i){
        this.capacity = i;
        this.fillCount = 0;
        first = last = capacity/2;
        arrayRing = (T[]) new Object[capacity];
    }


    public T peek(){
        return arrayRing[first];
    }


    public T dequeue(){
        if(fillCount == 0){
            throw new RuntimeException("arrayring is empty,error.");
        }

        T removed = arrayRing[first];
        fillCount --;
        arrayRing[first] = null;
        first = increase(first);
        return removed;


    }


    public void enqueue(T x){

        if(capacity == fillCount){
            throw new RuntimeException("arrayring is full, error.");
        }

        arrayRing[first] = x;
        fillCount += 1;
        first = increase(first);
    }


    public int increase(int i){
        if(i == capacity-1){
            return 0;
        }
        return i += 1;
    }


}
