public class Lab7Q2_1670200 {
    public static void main(String[] args) {
        String str = "At KMITL CHALONGKRUNG BMI MTL";
        String target = "MI";
        String replace = "CSP";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int offset = 0;
            while (offset < target.length() && str.charAt(i + offset) == target.charAt(offset)) {
                offset++;
            }
            if (offset == target.length()) {
                sb.append(replace);
                i += target.length() - 1;
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString()); // At KCSPTL CHALONGKRUNG BCSP MTL
    }

}
