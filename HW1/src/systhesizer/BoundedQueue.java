package systhesizer;

public interface BoundedQueue<T> {

    /** return size of the buffer */
    public int capacity();

    /**return number of items currently in the buffer*/
    public int fillCount();

    /**add item x to the end*/
    public void enqueue(T x);

    /**delete and return item from the front*/
    public T dequeue();

    /**return (but do not delete) item from the front*/
    public T peek();

    default boolean isEmpty(){
        return fillCount() == 0;
    }

    default boolean isFull(){
        return fillCount() == capacity();
    }
}
