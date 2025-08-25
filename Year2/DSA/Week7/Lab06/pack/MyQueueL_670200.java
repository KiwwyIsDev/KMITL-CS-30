package Lab06.pack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyQueueL_670200<T> implements Iterable<T> {
    private List<T> items = new LinkedList<>();

    public void enqueue(T d) {
        items.add(d);
    }

    public T dequeue() {
        return items.remove(0);
    }

    public T peek() {
        return items.get(0);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

}
