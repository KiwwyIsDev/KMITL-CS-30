package saleman;

public class Main {
    public static void main(String[] args) {
        int[][] distances = {
            {0, 30, 50, 40},  
            {30, 0, 30, 50},  
            {50, 30, 0, 25},  
            {40, 50, 25, 0}   
        };

        String[] cityNames = {"A", "B", "C", "D"};

        TSPBruteForce tsp = new TSPBruteForce(distances, cityNames);
        tsp.findShortestPath();
    }
}