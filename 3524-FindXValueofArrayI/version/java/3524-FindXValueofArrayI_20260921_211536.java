// Last updated: 21/09/2026, 21:15:36
1class Solution {
2    public long[] resultArray(int[] A, int k) {
3        long[] res = new long[k];
4        int[] freq = new int[k];
5        for (int n : A) {
6            n %= k;
7            int[] cur = new int[k];
8            cur[n] = 1;
9            for (int x = 0; x < k; x++)
10                cur[x * n % k] += freq[x];
11            freq = cur;
12            for (int x = 0; x < k; x++)
13                res[x] += freq[x];
14        }
15        return res;
16    }
17}