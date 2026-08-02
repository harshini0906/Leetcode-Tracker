// Last updated: 02/08/2026, 12:21:13
1class Solution {
2    public int smallestDistancePair(int[] nums, int k) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int low = 0, high = nums[n - 1] - nums[0];
6
7        while (low < high) {
8            int mid = low + (high - low) / 2;
9            if (countPairs(nums, mid) < k) low = mid + 1;
10            else high = mid;
11        }
12
13        return low;
14    }
15
16    private int countPairs(int[] nums, int maxDistance) {
17        int count = 0, j = 0;
18        for (int i = 0; i < nums.length; ++i) {
19            while (j < nums.length && nums[j] - nums[i] <= maxDistance) ++j;
20            count += j - i - 1;
21        }
22        return count;
23    }
24}