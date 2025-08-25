package Lab07.pack;

public class EqualSubsets_670200 {
    public EqualSubsets_670200() {}

    public static boolean dfs(int arr[], int i, int remain) {
        if (remain == 0) return true;
        if (i == arr.length || remain < 0) return false;

        return dfs(arr, i + 1, remain - arr[i]) || dfs(arr, i + 1, remain);
    }

    public static boolean dfs(int arr[], int i, int remain, Boolean memo[][]) {
        if (remain == 0) return true;
        if (i == arr.length || remain < 0) return false;

        if (memo[i][remain] != null) return memo[i][remain];
        memo[i][remain] = dfs(arr, i + 1, remain - arr[i]) || dfs(arr, i + 1, remain);
        return memo[i][remain];
    }

    public static boolean canPartition_Recurse(int [] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        if ((sum % 2) != 0) return false;
        int target = sum / 2;
        return dfs(arr, 0, target);
    }

    public static boolean canPartition_Memoiz(int [] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        if ((sum % 2) != 0) return false;
        int target = sum / 2;

        Boolean memo[][] = new Boolean[arr.length][target + 1];
        return dfs(arr, 0, target, memo);
    }

    public static boolean canPartition_DP(int [] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        if ((sum % 2) != 0) return false;
        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int val : arr) {
            for (int s = target; s >= val; s--) {
                dp[s] = dp[s] || dp[s - val];
            }
        }
        return dp[target];
    }


}
