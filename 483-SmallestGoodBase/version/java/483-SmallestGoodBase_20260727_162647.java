// Last updated: 27/07/2026, 16:26:47
1class Solution {
2    public int kInversePairs(int n, int k) {
3        int[][] dp = new int[1001][1001];
4        dp[0][0] = 1;
5        for (int i = 1; i <= n; i++) {
6            for (int j = 0; j <= k; j++) {
7                for (int x = 0; x <= Math.min(j, i - 1); x++) {
8                    if (j - x >= 0) {
9                        dp[i][j] = (dp[i][j] + dp[i - 1][j - x]) % 1000000007;
10                    }
11                }
12            }
13        }
14        return dp[n][k];
15    }
16}
17
18