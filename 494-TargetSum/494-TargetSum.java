// Last updated: 09/07/2026, 15:09:23
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
    int helper(int[] nums,int target,int idx, int sum) {
        if(idx==nums.length) {
            if(sum==target) return 1;
            return 0;
        }
        int plus=helper(nums,target,idx+1,sum+nums[idx]);
        int minus=helper(nums,target,idx+1,sum-nums[idx]);
        return plus+minus;
    }
}