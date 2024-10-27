public class Lab6Q2_4670200 {
    public static void main(String[] args) {
        int[][] input = {
                { 8, 1, 8, 9, 9 },
                { 5, 6, 4, 6, 7 },
                { 2, 3, 4, 6, 5 }
        };
        method1(input);

    }

    static void method1(int[][] input) {
        for (var row : input) {
            int[] dup = new int[10];
            String output = "";
            for (int i = 0; i < row.length; i++) {
                if (row[i] >= 2 && row[i] <= 9) {
                    // System.out.println(row[i]);
                    dup[row[i]]++;
                }
            }
            for (int check = 2; check < dup.length; check++) {
                // System.out.println(dup[check]);
                if (dup[check] > 1) {
                    // System.out.println(check);
                    output += check + " ";
                }
            }
            // output = output == "" ? "-1" : output;
            output = output.length() == 0 ? "-1" : output;
            System.out.println(output);
        }
    }

}
