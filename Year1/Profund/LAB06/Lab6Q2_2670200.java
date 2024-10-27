public class Lab6Q2_2670200 {
    public static void main(String[] args) {
        String input = "10 10 01 01 10 10"; // 01 01 10 10 = 2

        method1(input);
    }

    static void method1(String input) {
        int segments = 1;
        String[] tokens = input.split(" ");
        String pre = tokens[0];
        for (String token : tokens) {
            if (!pre.equals(token)) {
                segments++;
            }
            pre = token;
        }
        System.out.println(segments);
    }
}
