// Last updated: 09/07/2026, 15:12:57
class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0; i<m+1; i++) {
            for(int j=0; j<n+1; j++) {
                dp[i][j]=-1;
            }
        }
        int ans=helper(word1,word2,m,n,dp);
        return ans;
    }
    int helper(String ch1, String ch2, int m, int n, int[][] dp) {
        if(m==0) return n;
        if(n==0) return m;
        if(dp[m][n]!=-1) return dp[m][n];
        if(ch1.charAt(m-1) == ch2.charAt(n-1)) {
            int ans=0+helper(ch1, ch2, m-1, n-1, dp);
            return ans;
        }
        int x=1+helper(ch1,ch2,m-1,n, dp);   //removing
        int y=1+helper(ch1,ch2,m-1,n-1, dp); //replace
        int z=1+helper(ch1,ch2,m,n-1, dp);   //inserting
        dp[m][n]=Math.min(x,Math.min(y,z));
        return dp[m][n];
    }
}