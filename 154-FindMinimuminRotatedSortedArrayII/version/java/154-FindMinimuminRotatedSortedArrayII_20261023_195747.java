// Last updated: 23/10/2026, 19:57:47
1class Solution {
2    public int findMin(int[] nums) {
3        int n=nums.length;
4        int ans=nums[0];
5        for(int i=0; i<n-1; i++) {
6            if(nums[i]>nums[i+1]) ans=nums[i+1];
7        }
8        return ans;
9    }
10}