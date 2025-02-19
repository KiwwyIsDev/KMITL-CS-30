package adjacencyMatrix;

public class GraphMatrix {
    private int[][] adjacencyMatrix;
    private int size;

    public GraphMatrix(int[][] adjacencyMatrix) {
        this.size = adjacencyMatrix.length;
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public int[][] power(int exponent) {
        int[][] resultMatrix = MatrixUtils.identityMatrix(size);
        int[][] baseMatrix = this.adjacencyMatrix;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                resultMatrix = MatrixUtils.multiplyMatrix(resultMatrix, baseMatrix);
            }
            baseMatrix = MatrixUtils.multiplyMatrix(baseMatrix, baseMatrix);
            exponent >>= 1;
        }
        return resultMatrix;
    }

    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}