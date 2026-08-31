// Last updated: 31/08/2026, 16:15:06
1class Solution {
2    public int numSquares(int n) {
3        int[] dp = new int[n + 1];
4        Arrays.fill(dp, Integer.MAX_VALUE);
5        dp[0] = 0;
6        for (int i = 1; i <= n; ++i) {
7            int min_val = Integer.MAX_VALUE;
8            for (int j = 1; j * j <= i; ++j) {
9                min_val = Math.min(min_val, dp[i - j * j] + 1);
10            }
11            dp[i] = min_val;
12        }
13        return dp[n];
14    }
15}