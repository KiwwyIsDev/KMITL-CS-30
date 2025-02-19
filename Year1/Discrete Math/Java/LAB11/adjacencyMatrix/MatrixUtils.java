package adjacencyMatrix;

public class MatrixUtils {
    public static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB) {
        int size = matrixA.length;
        int[][] resultMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                if (matrixA[i][k] != 0) {
                    for (int j = 0; j < size; j++) {
                        resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
        }
        return resultMatrix;
    }

    public static int[][] identityMatrix(int size) {
        int[][] identityMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            identityMatrix[i][i] = 1;
        }
        return identityMatrix;
    }
}