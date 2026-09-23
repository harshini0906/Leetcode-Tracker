// Last updated: 23/09/2026, 09:28:34
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n=nums.length;
4        int j=0;
5        for(int i=0; i<n; i++) {
6            if(nums[i]!=0) {
7                int temp=nums[j];
8                nums[j]=nums[i];
9                nums[i]=temp;
10                j++;
11            }
12        }
13    }
14}