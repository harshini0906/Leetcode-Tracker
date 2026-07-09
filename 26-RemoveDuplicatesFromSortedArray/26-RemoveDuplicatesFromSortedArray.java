// Last updated: 09/07/2026, 15:13:43
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int res=1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]!=nums[i-1]) {
                nums[res]=nums[i];
                res++;
            }
        }
        return res;
    }
}