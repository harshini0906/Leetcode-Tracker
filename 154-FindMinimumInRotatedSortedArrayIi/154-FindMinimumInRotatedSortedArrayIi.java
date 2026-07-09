// Last updated: 09/07/2026, 15:11:48
class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int ans=nums[0];
        for(int i=0; i<n-1; i++) {
            if(nums[i]>nums[i+1]) ans=nums[i+1];
        }
        return ans;
    }
}