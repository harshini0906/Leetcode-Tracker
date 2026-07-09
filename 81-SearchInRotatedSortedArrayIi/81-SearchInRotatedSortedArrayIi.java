// Last updated: 09/07/2026, 15:12:50
class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        for(int i=0; i<n; i++) {
            if(nums[i] == target) return true;
        }
        return false;
    }
}