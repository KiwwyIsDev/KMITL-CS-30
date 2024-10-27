class ProFun08_Q3_670200 {
    public static void main(String[] args) {
        int[] a = { 7, 2, 3, 4 };
        int[] b = { 4, 6, 7, 8 };
        System.out.println(q3_common_element(a, b));
    }

    static boolean q3_common_element(int[] a, int[] b) {
        int i = 0, j = 0;
        
        while (i < a.length && j < b.length) {
            // System.out.println(i + " " + j + " " + a[i] + b[j]);I
            if (a[i] == b[j]) {
                return true;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return false;

    }

}