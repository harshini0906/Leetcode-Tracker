// Last updated: 06/08/2026, 11:36:29
1class Solution {
2    public int countPalindromicSubsequences(String s) {
3        int n = s.length();
4        int[][] dp = new int[n][n];
5        int MOD = 1000000007;
6        for (int i = 0; i < n; i++) dp[i][i] = 1;
7        for (int len = 2; len <= n; len++) {
8            for (int i = 0; i <= n - len; i++) {
9                int j = i + len - 1;
10                if (s.charAt(i) != s.charAt(j)) {
11                    dp[i][j] = (dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1]) % MOD;
12                } else {
13                    int l = i + 1, r = j - 1;
14                    while (l <= r && s.charAt(l) != s.charAt(i)) l++;
15                    while (l <= r && s.charAt(r) != s.charAt(j)) r--;
16                    if (l > r) { 
17                        dp[i][j] = (2 * dp[i+1][j-1] + 2) % MOD;
18                    } else if (l == r) { 
19                        dp[i][j] = (2 * dp[i+1][j-1] + 1) % MOD;
20                    } else { 
21                        dp[i][j] = (2 * dp[i+1][j-1] - dp[l+1][r-1]) % MOD;
22                    }
23                }
24                if (dp[i][j] < 0) dp[i][j] += MOD;
25            }
26        }
27        return dp[0][n-1];
28    }
29}