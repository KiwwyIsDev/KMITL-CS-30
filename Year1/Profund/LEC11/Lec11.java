import java.util.Arrays;

public class Lec11 {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
        demo3_sub();
        demo4();
        demo4_way2();
        demo5();
        demo6();
        demo7();
        demo8_transpose();
        demo9_ver_cell_by_cell();
        demo9_ver_inplace();
        demo9_ver_by_row();
    }

    static void demo1() {
        String[][] arr = { { "hello", "there", "world" }, { "how", "are", "you" } };
        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }

    static void demo2() {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int lastRow = arr.length - 1;
        for (int col = 0; col < arr[lastRow].length; col++) {
            System.out.println(arr[lastRow][col]);
        }
        System.out.println();

        int[] lastRowRef = arr[arr.length - 1];
        System.out.println(Arrays.toString(lastRowRef));
    }

    static void demo3() {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int lastCol = arr[0].length - 1;
        for (int row = 0; row < arr.length; row++) {
            System.out.println(arr[row][lastCol] + " ");
        }
        System.out.println();

    }

    static void demo3_sub() {
        System.out.println(Arrays.toString(demo3_sub1_callee()));
    }

    static int[] demo3_sub1_callee() {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int[] ans = new int[arr.length];
        for (int row = 0; row < arr.length; row++) {
            ans[row] = arr[row][arr[0].length - 1];

        }
        return ans;
    }

    static void demo4() {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int[] ans = new int[arr.length];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                ans[row] += arr[row][col];
            }
        }
        System.out.println(Arrays.toString(ans));
    }

    static void demo4_way2() {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int[] ans = new int[arr.length];

        int i = 0;
        for (var row : arr) {
            for (var x : row) {
                ans[i] += x;
            }
            i++;
        }
        System.out.println(Arrays.toString(ans));
    }

    static void demo5() {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };

        int ans = 0;
        for (int k = 0; k < arr.length; k++) {
            ans += arr[k][k];

        }
        System.out.println(ans);
    }

    static void demo6() {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        for (int row = 1; row < arr.length; row++) {
            for (int col = 0; col < row; col++) {
                arr[row][col] = 0;
            }
        }
        for (var row : arr) {
            System.out.println(Arrays.toString(row));
        }

    }

    static void demo7() {
        int[][] arr1 = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int[][] arr2 = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println(demo7_callee(arr1, arr2));

    }

    static boolean demo7_callee(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int row = 0; row < a.length; row++) {
            if (a[row].length != b[row].length) {
                return false;
            }
            for (int col = 0; col < a[0].length; col++) {
                if (a[row][col] != b[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    static void demo8_transpose() {
        int[][] arr = { { 11, 4, 3 }, { 2, 2, 3 }, };
        int[][] transpoed = new int[arr[0].length][arr.length];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                transpoed[col][row] = arr[row][col];
            }
        }

        for (var row : transpoed) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void demo9_ver_cell_by_cell() {
        int[][] data = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 } };
        int[][] flip1 = new int[data.length][data[0].length];
        int numRows = data.length - 1;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[0].length; col++) {
                flip1[numRows - row][col] = data[row][col];

            }
        }
        for (var row : flip1) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

    }

    static void demo9_ver_inplace() {
        int[][] data = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 } };
        int numRows = data.length - 1;
        int tmp;
        for (int row = 0; row < data.length / 2; row++) {
            for (int col = 0; col < data[0].length; col++) {
                tmp = data[row][col];
                data[row][col] = data[numRows - row][col];
                data[numRows - row][col] = tmp;
            }
        }
        for (var row : data) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

    }

    static void demo9_ver_by_row() {
        int[][] data = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 } };
        int numRows = data.length - 1;
        int[] tmp;
        for (int row = 0; row < data.length / 2; row++) {
            tmp = data[row];
            data[row] = data[numRows - row];
            data[numRows - row] = tmp;
        }

        for (var row : data) {
            System.out.println(Arrays.toString(row));
        }
    }
}