// Last updated: 09/07/2026, 15:09:16
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        String t=new StringBuilder(s).reverse().toString();
        int dp[][]=new int[n+1][n+1];
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<n+1; j++) {
                dp[i][j]=-1;
            }
        }
        int ans=helper(s,t,n,n,dp);
        return ans;
    }
    int helper(String s, String t, int m, int n, int dp[][]) {
        if(m==0 || n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(s.charAt(m-1) == t.charAt(n-1)) {
            int ans = 1 + helper(s, t, m-1, n-1, dp);
            return ans;
        }
        int ans1 = helper(s, t, m-1, n, dp);
        int ans2 = helper(s, t, m, n-1, dp);
        return dp[m][n]=Math.max(ans1, ans2);
    }
}