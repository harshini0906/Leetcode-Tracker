// Last updated: 09/07/2026, 15:08:44
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=n^(n>>1);
        return ((x&(x+1))==0) ? true:false;
    }
}