package Lab;

import java.util.*;
import java.nio.file.*;
import java.io.IOException;

class Employee {
    String id;
    String name;
    int salary;
    
    public Employee(String n) {
        name = n;
        int sal = 0;
        for (int j = 0; j < name.length(); j++)
            sal += name.charAt(j);
        salary = sal;
        int memAddress = System.identityHashCode(this);
        id = ""; // Integer.toHexString(memAddress);
    }

    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return id + " [" + name + "(" + salary + ")]";
    }

}

class Lab9_670200 {
    public static void main(String[] args) {
        q6();
        q7();
        q8();
        q9();
        q10();
        q11();
        q12();
        q13();
        q14();
        q15();
    }

    static void q6() {
        List<Employee> singers1 = new ArrayList<Employee>(Arrays.asList(new Employee("aba"), new Employee("abi")));
        // Arrays.asList() returns fixed sized ...but
        // ArrayList is not fixed, hence can call addAll()
        List<Employee> singers2 = new ArrayList<>();
        singers2.add(new Employee("abo"));
        singers2.add(new Employee("abe"));
        List<Employee> join = q6_1(singers1, singers2);
        System.out.println(singers1);
        System.out.println(singers2);
        System.out.println(join);
        singers1.addAll(singers2);
        System.out.println(singers1);
    }

    private static List<Employee> q6_1(List<Employee> l1, List<Employee> l2) {
        // List<Employee> combine = new ArrayList<>();
        // combine.addAll(l1);
        // combine.addAll(l2);
        List<Employee> combine = new ArrayList<>(l1);
        combine.addAll(l2);
        return combine;
    }   

    static void q7() {
        List<Employee> singers = Arrays.asList(new Employee("aba"), new Employee("abi"));
        System.out.println(singers);
        singers = q7_1(singers);
        System.out.println(singers);
    }
    private static List<Employee> q7_1(List<Employee> list) { 
        // List<Employee> newList = new ArrayList<>();
        // newList.add(list.get(0));
        // return newList;

        // return Arrays.asList(list.get(0));

        return new ArrayList<>(list.subList(0, 1));
    }

    static Employee yindee = new Employee("yindee");
    static Employee preeda = new Employee("preeda");
    static Employee pramote = new Employee("pramote");

    static void q8() {
        List<Employee> list1 = Arrays.asList(yindee, pramote);
        List<Employee> list2 = Arrays.asList(pramote, preeda); // duplicate "pramote"
        Set<Employee> empSet = new HashSet<>();

        empSet.addAll(list1);
        empSet.addAll(list2); // just add and use the set power 🔥

        List<Employee> q8_ans = new ArrayList<>(empSet);
        System.out.println(q8_ans);
    }

    static void q9() {
        Set<Employee> empSet1 = new HashSet<>(Arrays.asList(yindee, preeda, pramote));
        Set<Employee> empSet2 = new HashSet<>(Arrays.asList(yindee, pramote));
        
        empSet1.retainAll(empSet2); // keep only same (duplicate) between 2 collections 
        System.out.println(empSet1);
    }

    static void q10() {
        Set<Employee> empSet1 = new HashSet<>(Arrays.asList(yindee, preeda, pramote));
        Set<Employee> empSet2 = new HashSet<>(Arrays.asList(yindee, pramote));
        
        empSet1.removeAll(empSet2); // remove the same
        System.out.println(empSet1);
    }

    static void q11() {
        Set<Employee> empSet = new HashSet<>(Arrays.asList(yindee, preeda, pramote, preeda)); // create set ( change promote -> pramote )
        Employee[] q11_ans = new Employee[empSet.size()]; // create array size by empSet
        
        int i = 0;
        for (Employee e : empSet)
            q11_ans[i++] = e;
        for (Employee e : q11_ans)
            System.out.print(e + " ");
            System.out.println();
    }

    static ArrayList<Employee> empList;

    static {
        empList = new ArrayList<>();
        try (Scanner input = new Scanner(Paths.get("names.csv"))) {
            input.nextLine(); // skip first row
            while (input.hasNext()) {
                String row = input.nextLine().trim();
                empList.add(new Employee(row));
            }
            // System.out.println(empList);
            System.out.println("There are " + empList.size() + " employees.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void q12() {
        int n = 3;
        Map<String, Employee> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Employee employee = empList.get(i);
            map.put(employee.name, employee);
            // System.out.println(empList.get(i));
        }
        System.out.println(map);
    }

    static void q13() {
        int n = 3;
        Map<String, Employee> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Employee employee = empList.get(i);
            map.put(employee.name, employee);
        }
        
        Set<String> keySet = map.keySet();
        System.out.println(keySet);
    }
        
    static void q14() {
        PriorityQueue<Employee> pq = new PriorityQueue<>((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));
        pq.addAll(empList);
        List<Employee> q14_ans = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            q14_ans.add(pq.poll()); // pull the lowest and remove it like reverse pop btw see the comparator
        }
        System.out.println(q14_ans);
    }

    static void q15() {
        int sum = 0;
        int cnt = 0;
        Iterator<Employee> it;
        Long pqStart = System.nanoTime(); // System.currentTimeMillis();
        sum = 0;
        PriorityQueue<Employee> pq = new PriorityQueue<>((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));
        pq.addAll(empList);
        it = pq.iterator();
        while (it.hasNext()) {
            sum += it.next().getSalary();
            cnt++;
        }
        System.out.println("PQ (" + sum + ") takes "
                + String.format("%,d", System.nanoTime() - pqStart));
        Long listStart = System.nanoTime();
        ArrayList<Employee> clone = new ArrayList<>();
        sum = 0;
        clone.addAll(empList);
        Collections.sort(clone, (e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));
        it = clone.iterator();
        while (it.hasNext()) {
            sum += it.next().getSalary();
            cnt--;
        }
        System.out.println("ArrayList (" + sum + ") takes "
                + String.format("%,d", System.nanoTime() - listStart));
        if (cnt != 0)
            System.out.println("error on number of elements");
    }
    /* 
        PQ (60072) takes 1,301,800
        ArrayList (60072) takes 807,500 
    */

}
