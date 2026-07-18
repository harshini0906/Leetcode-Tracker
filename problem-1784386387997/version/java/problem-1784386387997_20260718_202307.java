// Last updated: 18/07/2026, 20:23:07
1class Solution {
2    public long maximumValue(int n, int s, int m) {
3        if(n==1) return s;
4        long k=n/2;
5        return (long)s+(long)k*(long)m-(long)(k-1);
6    }
7}