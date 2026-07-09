// Last updated: 09/07/2026, 15:13:33
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int i=0, j=n-1;
        while(i<=j) {
            int mid=(i+j)/2;
            if(target==nums[mid]) return mid;
            else if(target<nums[mid]) j=mid-1;
            else i=mid+1;
        }
        return i;

    }
}