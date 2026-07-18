// Last updated: 18/07/2026, 19:58:55
1class Solution {
2    public int findGCD(int[] nums) {
3        int max=nums[0];
4        int min=nums[0];
5        for(int i=0; i<nums.length; i++) {
6            if(nums[i]>max) max=nums[i];
7            if(nums[i]<min) min=nums[i];
8        }
9        int a=max;
10        int b=min;
11        while(b!=0) {
12            int temp=b;
13            b=a%b;
14            a=temp;
15        }
16        return a;
17    }
18}