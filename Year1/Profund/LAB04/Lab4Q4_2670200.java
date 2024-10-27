import java.util.Scanner;

public class Lab4Q4_2670200 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] wow = input.split(" ");
        for (String wo : wow) {
            int sum = 0;
            for (int i = 0; i < wo.length(); i++) {
                char digit = wo.charAt(i);
                sum += Character.getNumericValue(digit);

            }
            System.out.print(sum == 9);
            System.out.print(" ");

        }
        sc.close();

    }
}
