class Matrix {
    private double[][] data;
    private int size;

    public Matrix(double[][] data) {
        if (data.length != data[0].length) {
            throw new IllegalArgumentException("Matrix must be square");
        }
        this.size = data.length;
        this.data = new double[size][size];
        for (int i = 0; i < size; i++) {
            System.arraycopy(data[i], 0, this.data[i], 0, size);
        }
    }

    public double determinant() {
        return computeDeterminant(this.data, this.size);
    }

    private double computeDeterminant(double[][] matrix, int n) {
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        double det = 0;
        for (int i = 0; i < n; i++) {
            double[][] subMatrix = new double[n - 1][n - 1];
            for (int row = 1; row < n; row++) {
                int colIndex = 0;
                for (int col = 0; col < n; col++) {
                    if (col == i) continue;
                    subMatrix[row - 1][colIndex++] = matrix[row][col];
                }
            }
            det += Math.pow(-1, i) * matrix[0][i] * computeDeterminant(subMatrix, n - 1);
        }   
        return det;
    }
}

public class Main {
    public static void main(String[] args) {
        runTestCases();
    }

    private static void runTestCases() {
        double[][] data = {
            {3, 2, 6},
            {2, 2, 4},
            {-1, 3, 9}
        };
        Matrix matrix = new Matrix(data);
        System.out.println("Determinant: " + matrix.determinant());
    }
}
