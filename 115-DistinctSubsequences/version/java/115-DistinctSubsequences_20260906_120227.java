// Last updated: 06/09/2026, 12:02:27
1class Solution {
2    public int numDistinct(String s, String t) {
3        int n=s.length();
4        int m=t.length();
5        int[][] dp=new int[n+1][m+1];
6        for(int i=0; i<=n; i++) dp[i][0]=1;
7        for(int i=1; i<=n; i++) {
8            for(int j=1; j<=m; j++) {
9                if(s.charAt(i-1)==t.charAt(j-1)) dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
10                else dp[i][j]=dp[i-1][j];
11            }
12        }
13        return dp[n][m];
14    }
15}