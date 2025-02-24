import java.util.*;
import java.util.function.*;

public class Solution {
    List<String> cities;

    public Solution() {
        cities = Arrays.asList("Lampang", "Bangkok",
                "Petchaburi", "Tak", "Khonkaen");
    }

    public void printAllCities() {
        Consumer<String> consumer = city -> System.out.println(city);
        cities.forEach(consumer);
    }

    public String[] citiesEndsWith(String str) {
        List<String> ans = new ArrayList<>();
        Predicate<String> pred = x -> x.endsWith(str);
        for (String city : cities) {
            if (pred.test(city)) {
                ans.add(city);
            }
        }
        String[] result = new String[ans.size()];
        result = ans.toArray(result);
        return result;
    }

    public String[] first_n_letters(int n) {
        List<String> ans = new ArrayList<>();
        Function<String, String> func = city -> city.length() >= n ? city.substring(0, n) : city;
        for (String city : cities) {
            ans.add(func.apply(city));
        }
        String[] result = new String[ans.size()];
        return ans.toArray(result);
    }

    public String[] randomRemoveOneCharacter() {
        List<String> ans = new ArrayList<>();

        for (String city : cities) {
            Supplier<Integer> wow = () -> (int) (Math.random() * city.length());
            int rand = wow.get();
            // System.out.println(rand);
            StringBuilder sb = new StringBuilder(city).deleteCharAt(rand);
            ans.add(sb.toString());
        }

        String[] result = new String[ans.size()];
        return ans.toArray(result);
    }

    static void sub_01() {
        System.out.println("test java built-in functional interface");
        Solution s = new Solution();
        // consumer;
        s.printAllCities();
        // predicate
        String[] ans = s.citiesEndsWith("buri");
        System.out.println(Arrays.toString(ans));
        // function
        System.out.println(Arrays.toString(s.first_n_letters(4)));
        // supplier
        System.out.println(Arrays.toString(s.randomRemoveOneCharacter()));
    }

    
    

    public static void q1_halfEachNumber() {
        List < Integer > nums = Arrays.asList(100, 105);
        HalfValueInterface q0 = new HalfValueInterface() {
            public void printHalf(int n) {
              System.out.println(n / 2);
            }
        };
        for (int n: nums) {
          q0.printHalf(n);
        }
        HalfValueInterface halfVal = x -> System.out.println(x / 2);;
          for (int n: nums) {
            halfVal.printHalf(n);
          }
          Consumer <Integer> consumer = n -> System.out.println(n / 2);
          for (int n: nums) {
            consumer.accept(n);
        }
        Consumer < Integer > halfMe = n -> System.out.println(n / 2);
        nums.forEach(halfMe);
        nums.forEach(n -> System.out.println(n / 2));
        NumberProcessor np = new NumberProcessor();
        nums.forEach(np::printHalf);
    }
    
    
    public class TestPack8MethodReference {
        static List<Singer> singerList;
        static {
            singerList = new ArrayList<>();
            singerList.add(new Singer("Aba", SingStyle.POP));
            singerList.add(new Singer("Abi", SingStyle.ROCK));
            singerList.add(new Singer("Abo", SingStyle.POP));
            singerList.add(new Singer("Abu", SingStyle.ROCK));
        }
        
        public static void q3_lambda_comparator() {
            Comparator < Singer > byStyle1 = new Comparator < > () {
                @Override
                public int compare(Singer o1, Singer o2) {
                    return o1.getStyle().compareTo(o2.getStyle());
                } //by Enum .ordinal()
            };
            Collections.sort(singerList, byStyle1);
            singerList.forEach(System.out::println);
            Comparator < Singer > byStyle2 = (Singer o1, Singer o2) -> o1.getStyleString().compareTo(o2.getStyleString());
            Collections.sort(singerList, byStyle2);
            singerList.forEach(System.out::println);
        }
        public static void q4_method_reference_comparator() {
            System.out.println("--- Q4.1 by Name---");
            Collections.sort(singerList, Comparator.comparing(Singer::getName));
            singerList.forEach(System.out::println);
        
        }
        
        public static void q5_streamMap() {
            // Two separate statements
            // Consumer<Singer> singerNames = s -> System.out.println(s.getName());
            // singerList.forEach(singerNames);
            System.out.println("Q5.1--------");
            singerList.stream().map(s -> s.getName()).forEach(System.out::println);
            System.out.println("Q5.2--------");
            singerList.stream().map(Singer::getName).forEach(System.out::println);
        }
    }
    public static void main(String[] args) {
        sub_01();
        q1_halfEachNumber();
    }
}
