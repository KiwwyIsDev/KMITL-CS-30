public class Lab3Q367200 {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        while (i <= 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                count += i;
            }
            i++;
        }
        System.out.println(count);
    }
}