import java.util.Arrays;

class ProFun09_670200 {
    public static void main(String[] args) {
        int[] data = { 0, 1, 0, 1, 1, 0, 0, 0, 1 };
        shake(data);
        System.out.println(Arrays.toString(data));
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        zero_to_lower_triangular(matrix);
        int right = right_diag_sum(matrix);
        System.out.println(right);
        int[] digital = retrieve_main_diagonal(matrix);
        System.out.println(Arrays.toString(digital));
    }

    static void shake(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    static void zero_to_lower_triangular(int[][] data) {

        System.out.println();
        for (int row = 1; row < data.length; row++) {
            for (int col = 0; col < row; col++) {
                data[row][col] = 0;
            }
        }
        for (int[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int right_diag_sum(int[][] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i][i];
        }
        return sum;
    }

    static int[] retrieve_main_diagonal(int[][] input) {
        int[] diagonal = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            diagonal[i] = input[i][i];
        }
        return diagonal;
    }
}