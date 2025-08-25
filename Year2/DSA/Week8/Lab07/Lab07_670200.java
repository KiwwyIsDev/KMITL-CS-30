package Lab07;

import Lab07.pack.EqualSubsets_670200;
import Lab07.pack.GridPaths;

public class Lab07_670200 {
    public static void main(String[] args) {
        // task_01();
        task_02();
        
    }

    static void task_01() {
        int[] a = { 1, 5, 11, 5 };
        int[] b = { 1, 5, 30 };
        int[] c = { 1, 2, 3, 5 };
        EqualSubsets_670200 sol = new EqualSubsets_670200();
        System.out.println(sol.canPartition_Recurse(a));
        System.out.println(sol.canPartition_Memoiz(a));
        System.out.println(sol.canPartition_DP(a));
        System.out.println(sol.canPartition_Recurse(b));
        System.out.println(sol.canPartition_Memoiz(b));
        System.out.println(sol.canPartition_DP(b));
        System.out.println(sol.canPartition_Recurse(c));
        System.out.println(sol.canPartition_Memoiz(c));
        System.out.println(sol.canPartition_DP(c));
    }

    static void task_02() {
        int[][] grid = {
                        { 0, 0, 0, 0 },
                        { 0, 1, 0, 0 },
                        { 0, 0, 0, 1 },
                        { 1, 0, 0, 0 } 
                    };
        GridPaths sol = new GridPaths();
        System.out.println("number of paths: " + sol.numberOfPaths(grid));
    }
}
