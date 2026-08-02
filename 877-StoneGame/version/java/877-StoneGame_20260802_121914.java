// Last updated: 02/08/2026, 12:19:14
1class Solution {
2    public boolean stoneGame(int[] piles) {
3        int n = piles.length;
4        int[] dp = piles.clone();
5        for (int len = 2; len <= n; len++) {
6            for (int i = 0; i + len - 1 < n; i++) {
7                int j = i + len - 1;
8                dp[i] = Math.max(
9                    piles[i] - dp[i + 1],
10                    piles[j] - dp[i]
11                );
12            }
13        }
14        return dp[0] > 0;
15    }
16}