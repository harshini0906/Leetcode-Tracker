// Last updated: 05/09/2026, 20:07:34
class Solution {
    public int findClosest(int x, int y, int z) {
        int d1=Math.abs(z-x);
        int d2=Math.abs(z-y);
        if(d1==d2) return 0;
        return (d1<d2) ? 1:2;
    }
}