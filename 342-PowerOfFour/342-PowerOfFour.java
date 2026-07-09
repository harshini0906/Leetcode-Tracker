// Last updated: 09/07/2026, 15:10:14
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1) return false;
        if(((n&(n-1))==0) && ((n&0x55555555)!=0)) return true;
        else return false;
    }
}