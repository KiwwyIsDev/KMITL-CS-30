public class Lab5Q4_1670200 {
    public static void main(String[] args) {
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        int W = 0;
        int M = 0;
        for (int i = 0; i < str.length(); i++) {
            W = str.charAt(i) == 'W' ? W + 1 : W;
            M = str.charAt(i) == 'M' ? M + 1 : M;
        }
        System.out.println("W: " + W);
        System.out.println("M: " + M);
    }
}
