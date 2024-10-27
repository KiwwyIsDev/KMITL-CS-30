import java.util.Scanner;
// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int[] wow = new int[b];

        for (int i = 0; i < wow.length; i++) {
            wow[i] = sc.nextInt();
        }

        // System.out.println(Arrays.toString(wow));
        
        sc.close();
        int before = wow[0];
        String cant = "no";
        for (int i = 0; i < wow.length; i++) {
            if (wow[i] <= 0) {
                cant = "bruh";
                break;
            } else if (Math.abs((wow[i] - before)) > 2) {
                cant = "yes";
                break;
            }
            before = wow[i];
        }

        if (cant.equals("bruh")) {
            System.out.println("-_-\"");
            
        } else if (cant.equals("yes")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
