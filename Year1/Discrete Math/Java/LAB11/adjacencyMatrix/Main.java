package adjacencyMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter power n: ");
        int power = scanner.nextInt();

        int[][] adjacencyMatrix = {
            {0, 1, 0, 1},
            {1, 1, 2, 1},
            {0, 2, 0, 0},
            {1, 1, 0, 1}
        };

        GraphMatrix graph = new GraphMatrix(adjacencyMatrix);
        int[][] resultMatrix = graph.power(power);

        System.out.println("A^" + power + " :");
        graph.printMatrix(resultMatrix);

        scanner.close();
    }
}