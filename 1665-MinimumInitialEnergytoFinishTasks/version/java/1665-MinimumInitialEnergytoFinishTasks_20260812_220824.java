// Last updated: 12/08/2026, 22:08:24
1class Solution {
2    public int minimumEffort(int[][] shop) {
3        Arrays.sort(shop, (a, b) -> b[1] - b[0] - (a[1] - a[0]));
4        int start = shop[0][1];
5        int bal = shop[0][1] - shop[0][0];
6        int loan = 0;
7        for (int i = 1; i < shop.length; i++) {
8            int cost = shop[i][0];
9            int thresh = shop[i][1];
10            if (bal < thresh) {
11                loan += thresh - bal;
12                bal = thresh;
13            }
14            bal -= cost;
15        }
16        return start + loan;
17    }
18}