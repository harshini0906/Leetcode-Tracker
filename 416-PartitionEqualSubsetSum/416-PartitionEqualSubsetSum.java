// Last updated: 09/07/2026, 15:09:45
class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0; i<n; i++) {
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int x=sum/2;
        Boolean dp[][]=new Boolean[n+1][sum+1];
        
        return subset(nums,n,x,dp);
    }
    boolean subset(int nums[], int n, int x, Boolean[][] dp) {
        if(x==0) return true;
        if(n==0) return false;
        if(dp[n][x] != null) return dp[n][x];
        boolean take=false;
        if(nums[n-1]<=x) {
            take=subset(nums,n-1,x-nums[n-1],dp);
        }
        boolean not=subset(nums,n-1,x,dp);
        dp[n][x]= take||not;
        return dp[n][x];
    }
}