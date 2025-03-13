import java.util.*;

class Edge implements Comparable<Edge> {
    int source, destination, weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

class DisjointSet {
    int[] parent, rank;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int v) {
        if (parent[v] != v) {
            parent[v] = find(parent[v]);
        }
        return parent[v];
    }

    public void union(int root1, int root2) {
        int r1 = find(root1);
        int r2 = find(root2);

        if (r1 != r2) {
            if (rank[r1] > rank[r2]) {
                parent[r2] = r1;
            } else if (rank[r1] < rank[r2]) {
                parent[r1] = r2;
            } else {
                parent[r2] = r1;
                rank[r1]++;
            }
        }
    }
}

class Graph {
    int vertices;
    List<Edge> edges;

    public Graph(int vertices) {
        this.vertices = vertices;
        edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination, int weight) {
        edges.add(new Edge(source, destination, weight));
    }

    public void kruskalMST() {
        List<Edge> mst = new ArrayList<>();
        Collections.sort(edges);

        DisjointSet ds = new DisjointSet(vertices);
        int mstWeight = 0;

        System.out.println("Processing edges in increasing order of weight:\n");

        for (Edge edge : edges) {
            int root1 = ds.find(edge.source);
            int root2 = ds.find(edge.destination);

            System.out.println("Considering edge: " + edge.source + " - " + edge.destination + " (Weight: " + edge.weight + ")");

            if (root1 != root2) {
                System.out.println("Added to MST");
                mst.add(edge);
                mstWeight += edge.weight;
                ds.union(root1, root2);
            } else {
                System.out.println("Not added (Cycle detected)");
            }

            System.out.println("--------------------------------------");
        }

        System.out.println("\nMinimum Spanning Tree (MST):");
        for (Edge edge : mst) {
            System.out.println(edge.source + " - " + edge.destination + " : " + edge.weight);
        }
        System.out.println("Total weight of MST: " + mstWeight);
    }
}

public class KruskalAlgorithm {
    public static void main(String[] args) {
        new GraphTest().testGraph();
    }
}

class GraphTest {
    public void testGraph() {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 3, 6);
        graph.addEdge(2, 3, 8);
        graph.addEdge(3, 4, 9);
        graph.addEdge(4, 5, 10);
        graph.addEdge(3, 5, 3);
        
        graph.kruskalMST();
    }
}
