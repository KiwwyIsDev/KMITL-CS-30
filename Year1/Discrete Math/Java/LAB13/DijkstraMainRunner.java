import java.util.*;

public class DijkstraMainRunner {
    public static class DijkstraTest {
        public DijkstraTest() {
            Scanner scanner = new Scanner(System.in);
            Dijkstra graph = new Dijkstra(5);
    
            graph.addEdge(0, 1, 10);
            graph.addEdge(0, 2, 3);
            graph.addEdge(1, 2, 1);
            graph.addEdge(1, 3, 2);
            graph.addEdge(2, 3, 8);
            graph.addEdge(3, 4, 4);
    
            System.out.print("Enter start node: ");
            int start = scanner.nextInt();
            System.out.print("Enter end node: ");
            int end = scanner.nextInt();
    
            graph.findShortestPath(start, end);
    
            scanner.close();
        }
    }
    public class DijkstraMain {
        public static void main(String[] args) {
            new DijkstraTest();
        }
    }
}

class Dijkstra {
    private final int vertices;
    private final List<List<Edge>> adjList;
    
    private static class Edge {
        int target, weight;
        Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    public Dijkstra(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Edge(dest, weight));
        adjList.get(dest).add(new Edge(src, weight));
    }

    public void findShortestPath(int start, int end) {
        int[] distances = new int[vertices];
        int[] predecessors = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(predecessors, -1);
        distances[start] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];

            if (current[1] > distances[u]) continue;

            for (Edge edge : adjList.get(u)) {
                int v = edge.target;
                int newDist = distances[u] + edge.weight;

                if (newDist < distances[v]) {
                    distances[v] = newDist;
                    predecessors[v] = u;
                    pq.offer(new int[]{v, newDist});
                }
            }
        }

        printPath(start, end, predecessors, distances);
    }

    private void printPath(int start, int end, int[] predecessors, int[] distances) {
        if (distances[end] == Integer.MAX_VALUE) {
            System.out.println("No path found from " + start + " to " + end);
            return;
        }

        List<Integer> path = new ArrayList<>();
        for (int at = end; at != -1; at = predecessors[at]) {
            path.add(at);
        }
        Collections.reverse(path);

        System.out.println("Shortest path: " + path);
        System.out.println("Total distance: " + distances[end]);
    }
}
