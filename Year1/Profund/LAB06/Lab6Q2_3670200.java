import java.util.Scanner;

public class Lab6Q2_3670200 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    static void method1() {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int stop = sc.nextInt();
        String output = "";
        for (int i = start; i < stop; i++) {
            output += text.charAt(i);
        }
        System.out.println(output);
        sc.close();
    }

    static void method2() {
        String[] input = "KMITL 1 4".split(" ");
        String text = input[0];
        int start = Integer.parseInt(input[1]);
        int stop = Integer.parseInt(input[2]);
        char[] output = new char[stop - start];
        for (int i = start; i < stop; i++) {
            output[i - start] = text.charAt(i);
        }
        System.out.println(new String(output));
    }
}
