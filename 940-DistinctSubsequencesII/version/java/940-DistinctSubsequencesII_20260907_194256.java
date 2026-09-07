// Last updated: 07/09/2026, 19:42:56
1class Solution {
2    public int distinctSubseqII(String s) {
3        int n = s.length();
4        int MOD = (int) 1e9 + 7;
5        int[] dp = new int[n];
6        Arrays.fill(dp, 1);
7        int result = 0;
8        for (int i = 0; i < n; i++) {
9            for (int j = 0; j < i; j++) {
10                if (s.charAt(i) != s.charAt(j)) {
11                    dp[i] = (int) ((dp[i] + (long) dp[j]) % MOD);
12                }
13            }
14            result = (int) ((result + (long) dp[i]) % MOD);
15        }
16        return result;
17    }
18}