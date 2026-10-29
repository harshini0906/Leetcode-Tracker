// Last updated: 29/10/2026, 19:50:50
1class Solution {
2    public int rob(int[] nums) {
3        int n=nums.length;
4        if(n==1) return nums[0];
5        int[] a=new int[n-1];
6        int[] b=new int[n-1];
7        for(int i=0; i<n-1; i++) {
8            a[i]=nums[i];
9        }
10        for(int i=1; i<n; i++) {
11            b[i-1]=nums[i];
12        }
13        int[] dp1=new int[n];
14        Arrays.fill(dp1,-1);
15        int[] dp2=new int[n];
16        Arrays.fill(dp2,-1);
17        int ans1=helper(a,a.length-1,dp1);
18        int ans2=helper(b,b.length-1,dp2);
19        return Math.max(ans1,ans2);
20    }
21    int helper(int nums[], int i, int dp[]){
22        if(i<0) return 0;
23        if(dp[i]!=-1) return dp[i];
24        int take=nums[i]+helper(nums,i-2,dp);
25        int not=0+helper(nums,i-1,dp);
26        int ans=Math.max(take,not);
27        dp[i]=ans;
28        return ans;
29    }
30}