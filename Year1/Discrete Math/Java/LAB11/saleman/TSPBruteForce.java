package saleman;

import java.util.ArrayList;
import java.util.List;

public class TSPBruteForce {
    private int[][] distances;
    private String[] cityNames;
    private int cityCount;
    private int minDistance = Integer.MAX_VALUE;
    private List<Integer> bestPath;

    public TSPBruteForce(int[][] distances, String[] cityNames) {
        this.distances = distances;
        this.cityNames = cityNames;
        this.cityCount = distances.length;
        this.bestPath = new ArrayList<>();
    }

    private int calculateDistance(List<Integer> path) {
        int total = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            total += distances[path.get(i)][path.get(i + 1)];
        }
        total += distances[path.get(path.size() - 1)][path.get(0)];
        return total;
    }

    private void findPermutations(List<Integer> path, int start) {
        if (start == path.size() - 1) {
            int currentDistance = calculateDistance(path);
            printRoute(path, currentDistance);
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                bestPath = new ArrayList<>(path);
            }
            return;
        }

        for (int i = start; i < path.size(); i++) {
            TSPUtil.swap(path, start, i);
            findPermutations(path, start + 1);
            TSPUtil.swap(path, start, i);
        }
    }

    public void findShortestPath() {
        List<Integer> path = new ArrayList<>();
        for (int i = 0; i < cityCount; i++) {
            path.add(i);
        }
        findPermutations(path, 0);
        System.out.print("Best Path: ");
        printRoute(bestPath, minDistance);
    }

    private void printRoute(List<Integer> path, int distance) {
        System.out.print("Path: [");
        for (int i = 0; i < path.size(); i++) {
            System.out.print(cityNames[path.get(i)]);
            if (i < path.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println("] -> Distance: " + distance);
    }
}
