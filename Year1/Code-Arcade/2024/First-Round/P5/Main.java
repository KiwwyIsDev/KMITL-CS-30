import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i));
            int range = 0;
            char str_i = str.charAt(i);
            if (str_i == '[') {
                int j = i + 1;
                
                String s = "";
                range = str.charAt(i - 1) - '0';
                while (!(str.charAt(j) == ']')) {
                    s += str.charAt(j);
                    j++;
                }
                // System.out.println(range);
                // System.out.println(s);
                int count = 0;
                for (int rng = 0; rng < range; rng++) {
                    for(int chr = 0; chr < s.length(); chr++) {
                        char check = s.charAt(chr);
                        // System.out.println(check);

                        if (check == 'A') {
                            count++;
                        } else if (check == 'S') {
                            count--;
                        } else if (check == 'O') {
                            if (!(count < 0) && !(count > 25)) {
                                System.out.print((char) (count + 65));

                            } else {
                                System.out.print(":)");
                            }
                        }
                    }
                }
                // i = j;
            }
            
        }
        // System.out.println(str);
        sc.close();
    }
}