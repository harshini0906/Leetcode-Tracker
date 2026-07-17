// Last updated: 17/07/2026, 09:35:00
1class Solution {
2    public int[] gcdValues(int[] nums, long[] queries) {
3        int n = nums.length;
4        int maxValue = Arrays.stream(nums).max().orElse(0);
5        int[] divisorCount = new int[maxValue + 1];
6
7        for (int number : nums) {
8            for (int i = 1; i * i <= number; i++) {
9                if (number % i == 0) {
10                    divisorCount[i]++;
11                    if (i != number / i) {
12                        divisorCount[number / i]++;
13                    }
14                }
15            }
16        }
17
18        long[] gcdPairCount = new long[maxValue + 1];
19
20        for (int gcd = maxValue; gcd >= 1; gcd--) {
21            long count = divisorCount[gcd];
22            gcdPairCount[gcd] = count * (count - 1) / 2;
23            for (int multiple = 2 * gcd; multiple <= maxValue; multiple += gcd) {
24                gcdPairCount[gcd] -= gcdPairCount[multiple];
25            }
26        }
27
28        long[] prefixSum = new long[maxValue + 1];
29        for (int gcd = 1; gcd <= maxValue; gcd++) {
30            prefixSum[gcd] = prefixSum[gcd - 1] + gcdPairCount[gcd];
31        }
32
33        int[] result = new int[queries.length];
34        for (int i = 0; i < queries.length; i++) {
35            long query = queries[i];
36            long left = 1, right = maxValue, answer = -1;
37            while (left <= right) {
38                long mid = (left + right) / 2;
39                if (prefixSum[(int) mid] > query) {
40                    answer = mid;
41                    right = mid - 1;
42                } else {
43                    left = mid + 1;
44                }
45            }
46            result[i] = (int) answer;
47        }
48
49        return result;
50    }
51}