// Last updated: 23/07/2026, 20:18:28
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n=nums.length;
4        if(n<=2) return n;
5        int mask=0;
6        for(int num:nums) mask|=num;
7        return mask+1;
8    }
9}