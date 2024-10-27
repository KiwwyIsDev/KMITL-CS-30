public class Lab5Q4_2670200 {
    public static void main(String[] args) {
        String s1 = "I am happy".toLowerCase();
        int index = -1;

        for (int i = 0; i < s1.length(); i++) {
            switch (s1.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    index = i;
                    i = s1.length();
                    break;
            }
        }

        System.out.println(index);
    }
}
