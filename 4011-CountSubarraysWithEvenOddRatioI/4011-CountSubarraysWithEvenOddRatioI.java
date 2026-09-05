// Last updated: 05/09/2026, 20:06:10
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int n=nums.length;
        int count=0;
        for(int i=0; i<n; i++){
            long e=0,o=0;
            for(int j=i; j<n; j++){
                if(nums[j]%2==0) e++;
                else o++;
                if(o>0 && (e*b<=o*a)) count++;
            }
        }
        return count;
    }
}