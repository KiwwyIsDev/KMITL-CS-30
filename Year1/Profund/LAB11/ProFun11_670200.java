import java.util.Arrays;
import java.util.Random;

class ProFun11_670200 {
    public static int[][] gen_bomb(int rows, int cols, int num_bomb) {
        int[][] bomb = new int[rows][cols];
        Random rand = new Random();
        int bomb_placed = 0;

        while (bomb_placed < num_bomb) {
            int randRow = rand.nextInt(rows);
            int randCol = rand.nextInt(cols);
            if (bomb[randRow][randCol] != 9) {
                bomb[randRow][randCol] = 9;
                bomb_placed++;
            }
        }

        return bomb;
    }

    public static int[][] q3_markMap(int[][] bMap) {
        int rows = bMap.length;
        int cols = bMap[0].length;
        int[][] mMap = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (bMap[row][col] == 9) {
                    mMap[row][col] = 9;
                } else {
                    int count = 0;
                    for (int i = -1; i <= 1; i++) { // -1 0 1
                        for (int j = -1; j <= 1; j++) { // - 1 0 1
                            if (row + i >= 0 && row + i < rows && col + j >= 0 && col + j < cols) {
                                if (bMap[row + i][col + j] == 9) {
                                    count++;
                                }
                            }
                        }
                    }
                    mMap[row][col] = count;
                }
            }
        }
        return mMap;
    }

    public static void main(String[] args) {
        int[][] arr = gen_bomb(8, 13, 20);
        int[][] map2 = q3_markMap(arr);

        for (int row = 0; row < arr.length; row++)
            System.out.println(Arrays.toString(arr[row]) + "\t" + Arrays.toString(map2[row]));
    }

}