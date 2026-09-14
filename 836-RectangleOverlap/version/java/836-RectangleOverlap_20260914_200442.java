// Last updated: 14/09/2026, 20:04:42
1class Solution {
2    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
3        int left = Math.max(rec1[0], rec2[0]);
4        int right = Math.min(rec1[2], rec2[2]);
5        int bottom = Math.max(rec1[1], rec2[1]);
6        int top = Math.min(rec1[3], rec2[3]);
7        return left < right && bottom < top;
8    }
9}