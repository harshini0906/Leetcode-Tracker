// Last updated: 09/07/2026, 15:10:45
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1; i<n; i++) {
            if(nums[i]==nums[i-1]) return true;
        }
        return false;
    }
}