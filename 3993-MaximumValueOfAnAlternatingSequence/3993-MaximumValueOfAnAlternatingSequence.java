// Last updated: 05/09/2026, 20:05:43
class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1) return s;
        long k=n/2;
        return (long)s+(long)k*(long)m-(long)(k-1);
    }
}