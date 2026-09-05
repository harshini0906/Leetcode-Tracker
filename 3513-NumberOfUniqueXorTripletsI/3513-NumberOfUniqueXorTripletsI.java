// Last updated: 05/09/2026, 20:07:37
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        int mask=0;
        for(int num:nums) mask|=num;
        return mask+1;
    }
}