package Lab06;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_670200 {

    public int maxLandArea(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int max = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1 && !visited[r][c]) {
                    int area = bfs(grid, visited, r, c);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    private int bfs(int[][] grid, boolean[][] visited, int startR, int startC) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{startR, startC});
        visited[startR][startC] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            count++;

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (isValid(grid, visited, nr, nc)) {
                    visited[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        return count;
    }

    private boolean isValid(int[][] grid, boolean[][] visited, int r, int c) {
        return r >= 0 && r < grid.length &&
               c >= 0 && c < grid[0].length &&
               grid[r][c] == 1 && !visited[r][c];
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 0, 0},
            {1, 0, 0, 1},
            {0, 0, 1, 1},
            {1, 1, 0, 0}
        };
        Solution_670200 s = new Solution_670200();
        int result = s.maxLandArea(grid);
        System.out.println("Largest land area: " + result);
    }
}
