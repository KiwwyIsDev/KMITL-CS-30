public class Lab6Q2_1670200 {
    public static void main(String[] args) {
        int[][] data = { { 58, 4, 13, 15, 63, 9, 8, 81, 1, 78 },
                { 12, 14, 16, 18, 20, 22, 23, 25, 37, 38, 39, 40 } };
        int value = 0;
        for (var row : data) {
            boolean isSort = true;
            System.out.println("row at : " + value);
            for (int idx = 0; idx < row.length - 1 && isSort; idx++) {
                isSort &= row[idx] <= row[idx + 1];
            }
            System.out.println(isSort);
            value++;
        }
        // System.out.println(isSort);
    }
}