// Last updated: 09/07/2026, 15:11:05
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(nums,n-1,dp);
    }
    int helper(int nums[], int i, int dp[]){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+helper(nums,i-2,dp);
        int not=0+helper(nums,i-1,dp);
        int ans=Math.max(take,not);
        dp[i]=ans;
        return ans;
    }
}