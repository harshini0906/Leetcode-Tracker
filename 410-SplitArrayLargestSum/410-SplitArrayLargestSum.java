// Last updated: 09/07/2026, 15:09:52
class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0,high=0;
        for(int num:nums) {
            low=Math.max(low,num);
            high+=num;
        }
        while(high>low) {
            int mid=(low+high)/2;
            int pieces=helper(nums,mid);
            if(pieces>k) low=mid+1;
            else high=mid;
        }
        return low;
    }
    int helper(int[] nums, int max) {
        int curr=0,count=1;
        for(int num:nums) {
            if(curr+num>max) {
                count++;
                curr=num;
            }
            else curr+=num;
        }
        return count;
    }
}