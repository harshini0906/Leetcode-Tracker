// Last updated: 09/07/2026, 15:06:16
class Solution {
    public int findClosest(int x, int y, int z) {
        int d1=Math.abs(z-x);
        int d2=Math.abs(z-y);
        if(d1==d2) return 0;
        return (d1<d2) ? 1:2;
    }
}