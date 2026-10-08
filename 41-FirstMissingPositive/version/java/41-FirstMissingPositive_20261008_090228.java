// Last updated: 08/10/2026, 09:02:28
1class Solution {
2    void swap(int[] arr, int i, int j) {
3        int temp=arr[i];
4        arr[i]=arr[j];
5        arr[j]=temp;
6    }
7    public int firstMissingPositive(int[] nums) {
8        int n=nums.length;
9        for(int i=0; i<n; i++) {
10            while(nums[i]>0 && nums[i]<=n && nums[i]!=nums[nums[i]-1]) swap(nums,i,nums[i]-1);
11        }
12        for(int i=0; i<n; i++) {
13            if(nums[i]!=i+1) return i+1;
14        }
15        return n+1;
16    }
17}