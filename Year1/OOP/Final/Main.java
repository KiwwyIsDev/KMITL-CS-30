import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A", "B", "Z", "D", "AJAJ", "JAJA");
        List<Integer> numbers = Arrays.asList(199, 1, 42, 239, 29, 23, 42, 52, 54, 56);
        
        System.out.println(names.stream().collect(Collectors.joining()));
    }
}
