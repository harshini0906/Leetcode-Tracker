// Last updated: 30/08/2026, 15:08:11
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n = nums.length;
4        int left = 0;
5        int right = 0;
6        for (int i = 1; i < n; i++) {
7            if (nums[i] < nums[left])
8                left = i; 
9            if (nums[i] > nums[right])
10                right = i;
11        }
12        if (left < right) {
13            int temp = left;
14            left = right;
15            right = temp;
16        } 
17        int ans = n;
18        for (int i = 0; i <= n; i++) {
19            int extra = 0;
20            if (right >= i)
21                extra = n - right;
22            else if (left >= i)
23                extra = n - left;
24            ans = Math.min(ans, i + extra);
25        }
26        return ans;
27    }
28}