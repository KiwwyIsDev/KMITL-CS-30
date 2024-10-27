public class wow {
    public static void main(String[] args) {
        int arumsumsum = 0;
        for (int i = 1; i < 200; i++) {
            if (i % 10 == 0) {
                continue;
            }
            arumsumsum += i;

        }
        System.out.println(arumsumsum);
    }
}