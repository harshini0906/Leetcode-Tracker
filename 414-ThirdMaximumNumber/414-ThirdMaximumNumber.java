// Last updated: 09/07/2026, 15:09:50
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        for(int j=1; j<n; j++) {
            if(nums[i]!=nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        int unique=i+1;
        if(unique>=3) return nums[unique-3];
        return nums[unique-1];
    }
}