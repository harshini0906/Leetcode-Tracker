// Last updated: 05/09/2026, 20:05:54
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int mid=n/2;
        int count=0;
        for(int i=0; i<n; i++) {
            if(nums[mid]==nums[i]) count++;
        }
        if(count==1) return true;
        return false;
    }
}