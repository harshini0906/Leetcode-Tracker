// Last updated: 09/07/2026, 15:06:17
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0, dd=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<10) sd=sd+nums[i];
            else dd=dd+nums[i];
        }
        if(sd!=dd) return true;
        else return false;
    }
}