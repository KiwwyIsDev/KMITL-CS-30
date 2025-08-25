package Lab07.pack;

public class GridPaths {
    static int recurse(int arr[][], int i, int j) {
        int sum = 0;
        if (i < 0 || i > arr.length - 1) return 0;
        if (j < 0 || j > arr.length - 1) return 0;
        if (arr[i][j] == 1) return 0;

        if (i == arr.length - 1 && j == arr.length - 1) return 1;

        sum += recurse(arr, i + 1, j);
        sum += recurse(arr, i, j + 1);
        return sum;
    }

    public static int numberOfPaths(int [][]grid) {
        
        return recurse(grid, 0, 0);
    }
}



/*

    -1,-1   -1,0    -1,1
    0,-1            0,1
    1,-1    1,0     1,1

 */
