// Last updated: 27/07/2026, 16:28:54
1class Solution {
2    public int findKthNumber(int m, int n, int k) {
3        int l=0, h=m*n;
4        while (l < h) {
5            int mid=(l+h)/2, count=0;
6            for (int i=1; i<=m; i++)
7                count += n < mid/i ? n : mid/i;
8            if (count >= k)  h = mid;
9            else  l = mid+1;
10        }
11        return l;
12    }
13}