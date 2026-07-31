// Last updated: 31/07/2026, 09:05:16
1class Solution {
2    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
3        int n = nums.length, sum1 = 0, sum2 = 0, sum3 = 0;
4        int max1 = 0, max12 = 0, max123 = 0;
5        int index1 = 0, index12_1 = 0, index12_2 = k;
6        int[] ans = {0, k, 2 * k};
7        for (int i = 0; i < k; i++) {
8            sum1 += nums[i];
9            sum2 += nums[i + k];
10            sum3 += nums[i + 2 * k];
11        }
12        max1 = sum1;
13        max12 = sum1 + sum2;
14        max123 = sum1 + sum2 + sum3;
15        for (int i = 0; i <= n - 3 * k; i++) {
16            if (i > 0) {
17                sum1 = sum1 - nums[i - 1] + nums[i + k - 1];
18                sum2 = sum2 - nums[i + k - 1] + nums[i + 2 * k - 1];
19                sum3 = sum3 - nums[i + 2 * k - 1] + nums[i + 3 * k - 1];
20            }
21            if (sum1 > max1) {
22                max1 = sum1;
23                index1 = i;
24            }
25            if (max1 + sum2 > max12) {
26                max12 = max1 + sum2;
27                index12_1 = index1;
28                index12_2 = i + k;
29            }
30            if (max12 + sum3 > max123) {
31                max123 = max12 + sum3;
32                ans = new int[]{index12_1, index12_2, i + 2 * k};
33            }
34        }
35        return ans;
36    }
37}