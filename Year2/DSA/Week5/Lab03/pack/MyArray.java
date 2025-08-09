package Lab03.pack;

public class MyArray extends MyArrayBasic {
    int MAX_SIZE = 100_000;
    int data[];
    int size = 0;

    public MyArray() {
        data = new int[MAX_SIZE];
    }

    public MyArray(int max_za_hahaha) {
        MAX_SIZE = max_za_hahaha;
        data = new int[MAX_SIZE];
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int d) {
        if (isFull())
            data = expand();
        data[size++] = d;
    }

    @Override
    public void insert_unordered(int index, int d) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = d;
        size++;

    }

    @Override
    public void delete(int index) {
        if (isEmpty()) {
            throw new IllegalStateException("Array is empty.");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public int binarySearch(int d) {
        java.util.Arrays.sort(data, 0, size);
        int prev = 0, next = size - 1;
        while (prev <= next) {
            int mid = (prev + next) / 2;
            if (data[mid] == d)
                return mid;
            else if (data[mid] > d)
                next = mid - 1;
            else
                prev = mid + 1;
        }
        return -(prev + 1);
    }

    public void insert(int d) {
        int cur = binarySearch(d);
        if (cur >= 0)
            return;
        cur = -(cur + 1);
        if (isFull()) {
            data = expand();
        }
        for (int i = size; i > cur; i--) {
            data[i] = data[i - 1];
        }
        data[cur] = d;
        size++;
    }

    private int[] expand() {
        MAX_SIZE = 2 * MAX_SIZE;
        int newData[] = new int[MAX_SIZE];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;

        return data;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(data[i]);
            sb.append(",");
        }
        if (size > 0)
            sb.append(data[size - 1]);
        sb.append("]");
        return sb.toString();
    }
}