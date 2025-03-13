package wk11_Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        sub_00();
    }
    static void sub_00() {
        StuList eList = new StuList();
        // eList.q0();
        // eList.q1();
        // eList.q2();
        // eList.q3();
        // eList.q4();
        // eList.q5();
        // eList.q6(); 
        // eList.q7();
        // eList.q8();
        // eList.q9a();
        // eList.q9b();
        eList.q9c();
        // eList.q10();
        // eList.q11();
    }
}
class StuList {
    static Student [] stuArr = {   new Student("Jeff Bezos",200_000,"Tak"),
                                    new Student("Bill Gates",300_000, "Phuket" ),
                                    new Student("Mark Zuckeberg",100_000,"Tak"),
                                };
    List<Student> stuList;
    {
        stuList = Arrays.asList(stuArr);
    }
    void q0() {
        System.out.println("size= " + stuList.size());
    }
    void q1() {
        // .forEach
        stuList.stream().forEach(e -> e.goingTo("Lampang"));
    }
    void q2() { 
        // collect names as List , collect names as arr 
        List<String> ans1 = stuList.stream()
                                    .map(Student::getName).collect(Collectors.toList());
        ans1.forEach(System.out::println);

        String [] ans2 = stuList.stream()
                                    .map(e -> e.getName()).toArray(String[]::new);
        System.out.println( Arrays.toString(ans2) );
    }
    void q3() {
        // filter 
        // List of students whose salary is more than 200K
        List<Student> ans = stuList.stream()
                                        .filter(e -> e.getSalary() > 200_000).collect(Collectors.toList());
        ans.stream().forEach(System.out::println);
    }
    void q4() {
        // flatmap 
        // Given lists of lists, merge and return a list of students whose salary is more than 200K
        List<List<Student>> jeffBillMark = Arrays.asList(
                                                Arrays.asList(stuArr[0]),
                                                Arrays.asList(stuArr[1]),
                                                Arrays.asList(stuArr[2])
                                                );
        List<Student> ans = jeffBillMark.stream()
                                            .flatMap(Collection::stream)
                                            .filter(e -> e.getSalary() > 200_000)
                                            .collect(Collectors.toList());
        ans.stream().forEach(System.out::println); 

        List<String> namesSalaryGreaterThan200K 
                           = jeffBillMark.stream()
                                .flatMap(Collection::stream)
                                .filter(e -> e.getSalary() > 200_000)
                                .map(e -> e.getName())
                                .collect(Collectors.toList());
        System.out.println(namesSalaryGreaterThan200K);
    }
    void q5() {
        // count 
        // how many students blah blah
        Long ans1 = stuList.stream()/* .filter(blah blah) */
                            .count();
        System.out.println(ans1); 

        // return (list of) 2 students from the list 
        List<Student> ans = stuList.stream()
                                    .limit(2).toList();
        ans.forEach(System.out::println);
    }
    void q6() { 
        // findFirst 
 
        Optional<Student> ans = stuList.stream()/* .filter(blah blah) */
                                            .findFirst();
        ans.ifPresent(System.out::println); // System.out.println(ans.get()); 

        stuList.stream().findFirst().ifPresent(System.out::println); 
    }
    void q7() { 
        // peek 
         
        List<Student> ans = stuList.stream()
                                        .peek(e -> System.out.println(e.getSalary()))
                                        // .peek(System.out::println)
                                        .collect(Collectors.toList());
        System.out.println("---q7---");
        System.out.println(ans);
    }
    void q8() {
        // sort (Comparator) 
        // sort by salary 
        List<Student> ans = stuList.stream()
                                    .sorted(Comparator.comparing(Student::getSalary))
                                    .collect(Collectors.toList());
        ans.forEach(System.out::println);

        // sort by name
        List<String> ans2 = stuList.stream()   
                                        .map(Student::getName)
                                        // what's wrong with .sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
                                        .sorted((name1, name2) -> name1.compareTo(name2))
                                        .collect(Collectors.toList()); 
        System.out.println(ans2);
    }
    void q9a() { 
        // max (Comparator) 
        // very clean with mapToDouble, mapToInt
        Double maxSalary = stuList.stream()
                                    .mapToDouble(Student::getSalary)
                                    .max(/* no-comparator required */)
                                    .getAsDouble();
        System.out.println(maxSalary); 
    }
    void q9b() {
        Double maxSalary;
        Optional<Double> dOpt = stuList.stream()
                                        .map(Student::getSalary)
                                        .max(Double::compareTo);
        maxSalary = dOpt.get();
        System.out.println(maxSalary);

        Optional<Student> eOpt = stuList.stream()
                                            .max(Comparator.comparing(Student::getSalary));
        maxSalary = eOpt.get().getSalary();
        System.out.println(maxSalary);
        
        eOpt = stuList.stream()
                        .max((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary())); 
                        // reminder ... must not do the following 
                        /* (e1,e2) -> (int)( e1.getSalary() - e2.getSalary() ) */
    
        maxSalary = eOpt.get().getSalary();
        System.out.println(maxSalary);        
        
        /* why can this not? */ //Long x = empList.stream().map(Employee::getSalary).average();
    }
    void q9c() { 
        // summaryStatistics
        // aggregate function (average, count, max, min, sum)
        DoubleSummaryStatistics anyAggregate = stuList.stream()
                                                        .mapToDouble(Student::getSalary).summaryStatistics();
        System.out.println(
            anyAggregate.getAverage() + ", "
            + anyAggregate.getCount() + ", "
            + anyAggregate.getMax() + ", "
            + anyAggregate.getMin() + ", "
            + anyAggregate.getSum()
        );
    }
    void q10() {
        // hash map 
        // subgroup of students with given keys
        Map<String,List<Student>> ans = stuList.stream()
                                                .collect(Collectors.groupingBy(Student::getProvince));
        ans.entrySet().stream().forEach(System.out::println);
        System.out.println("---q10---");
        System.out.println(ans);
    }
    void q11() {
        // reduce
        Double max = stuList.stream()
                                .map(Student::getSalary)
                                .reduce(Double.NEGATIVE_INFINITY, (prev, a) -> a > prev ? a : prev); 
        System.out.println(max);

    }
}
class Student {
    private String name;
    private double salary;
    private String province;
    
    public Student(String name, double salary, String province) {
        this.name = name;
        this.salary = salary;
        this.province = province;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getProvince() {
        return province;
    }
    public void goingTo(String city) {
        System.out.println(name +  " is going to " + city);
    }
    public String toString() {
        return name + "(" + salary + ", " + province + ")";
    }
}
