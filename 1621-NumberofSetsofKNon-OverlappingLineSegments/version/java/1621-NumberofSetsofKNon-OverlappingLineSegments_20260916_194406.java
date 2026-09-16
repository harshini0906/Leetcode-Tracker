// Last updated: 16/09/2026, 19:44:06
1class Solution {
2    public int numberOfSets(int n, int k) {
3        final int MOD = 1_000_000_007;
4        long[][] dp = new long[n][k + 1];
5        for (int i = 0; i < n; i++) dp[i][0] = 1;
6        for (int j = 1; j <= k; j++) {
7            long sum = 0;
8            for (int i = 1; i < n; i++) {
9                sum = (sum + dp[i - 1][j - 1]) % MOD;
10                dp[i][j] = (dp[i - 1][j] + sum) % MOD;
11            }
12        }
13        return (int) dp[n - 1][k];
14    }
15}