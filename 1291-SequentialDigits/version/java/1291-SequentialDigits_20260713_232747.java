// Last updated: 13/07/2026, 23:27:47
1class Solution {
2    static final int[] q = new int[45];
3
4    static {
5        int n = 0;
6
7        for (int i = 1; i < 10; i++)
8            q[n++] = i;
9
10        for (int i = 0; i < n; i++) {
11            int d = q[i] % 10;
12
13            if (d < 9) 
14                q[n++] = q[i] * 10 + d + 1;
15        }
16    }
17
18    public List<Integer> sequentialDigits(int low, int high) {
19        List<Integer> res = new ArrayList<>();
20
21        for (int x : q)
22            if (x >= low && x <= high)
23                res.add(x);
24
25        return res;
26    }
27}