import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        demo3();
    }

    static void demo1() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.print("[");
        for (int n : list)
            System.out.print(n + " ");
        System.out.println("]"); // [1 2]
        int ans = list.remove(0);
        System.out.print("ans = " + ans + " -> [");
        for (int n : list)
            System.out.print(n + " ");
        System.out.println("]"); // [2]
        list.add(5);
        list.add(3);
        list.add(3, 1); // 2 5 '1' 3 4
        list.add(6);
        list.add(4);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.print("] (");
        System.out.println(list.size() + ")");
        // [2 5 3 1 6 4 ] (6)
    }

    static void demo3() {
        Province A = new Province("A"); // init A
        Province start = A; // city start is A
        A.nextProvince = new Province("C"); // next city of A is C
        Province B = new Province("B"); // init B
        B.nextProvince = A.nextProvince; // next city of B is next city of A (C)
        A.nextProvince = B; // change next city of A to B
        // A -> C
        // B -> C
        // A -> B -> C

        Province city = start;
        while (city != null) {
            System.out.println(city.name);
            city = city.nextProvince;
        }
    }
}

class Province {
    String name;
    Province nextProvince;

    Province(String n) {
        this.name = n;
    }
}