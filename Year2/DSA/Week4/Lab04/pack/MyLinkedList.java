package Lab04.pack;

public class MyLinkedList {

    int size = 0;

    public MyLinkedList() {
        this.size = 0;
    }

    public class Node {

        int data;
        Node next;

        public Node(int d) {
            data = d;
        }
    }

    Node head = null;

    public int size() {
        return size;
    }

    public void add(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;

        }
        size++;
    }

    public void add(int[] x) {
        for (int xx : x) {
            Node n = new Node(xx);
            if (head == null) {
                head = n;
            } else {
                n.next = head;
                head = n;

            }
            size++;
        }
    }

    // public void insert(int d) {
    //     Node n = new Node(d);
    //     if (head == null) {
    //         head = n;
    //         size++;
    //         return;
    //     }
    //     Node c = head;
    //     Node prev = null;

    //     while (c.data < d) {
    //         prev = c;
    //         c = c.next;
    //     }

    //     prev.next = n;
    //     n.next = c;
    //     size++;
    // }

    public void insert(int d) {
        if (head == null) {
            head = new Node(d);
            size ++;
            return;
        }
        if (head.data > d) {
            Node q =new Node(d);
            q.next = head;
            size++;
            return;
        }
        Node cur = head;
        while (cur.next != null && cur.next.data < d) {
            cur = cur.next;
        }
        Node q = new Node(d);

        q.next = cur.next;
        cur.next = q;
        size++;
    }

    public void insert(int[] x) {

    }

    public void delete(int d) {
    }

    public int getAt(int i) {
        Node p = head;
        while (i > 0) {
            p = p.next;
            i--;
        }
        return p.data;
    }

    public void setAt(int d, int i) {
        Node p = head;
        while (i > 0) {
            p = p.next;
            i--;
        }
        p.data = d;
    }

    public Node find(int d) {
        Node p = head;
        while (p != null) {
            if (p.data == d)
                return p;
            p = p.next;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("head ");
        Node p = head;
        while (p != null) {
            sb.append("--> [");
            sb.append(p.data);
            sb.append("] ");
            p = p.next;
        }
        sb.append("-> null");
        return new String(sb);
    }

}