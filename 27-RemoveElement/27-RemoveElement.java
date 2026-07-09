// Last updated: 09/07/2026, 15:13:41
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int res=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=val) {
                nums[res]=nums[i];
                res++;
            }
        }
        return res;
    }
}