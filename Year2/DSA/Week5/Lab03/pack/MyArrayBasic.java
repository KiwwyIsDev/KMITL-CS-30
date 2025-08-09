package Lab03.pack;

public class MyArrayBasic {
    protected int MAX_SIZE = 5;
    protected int data[] = new int[MAX_SIZE];
    protected int size = 0;

    public MyArrayBasic(int... arr) {
    }

    public void add(int d) {
        data[size++] = d;
    }

    public int find(int d) {
        for (int i = 0; i < size; i++) {
            if (data[i] == d) {
                return i;
            }
        }
        return -1;
    }

    public void insert_unordered(int index, int d) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = d;
        size++;

    }

    public void delete(int index) {
        if (size <= 0)
            return;
        data[index] = data[--size];
    }

    public int getAt(int i) {
        return data[i];
    }

    public void setAt(int i, int d) {
        data[i] = d;
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
