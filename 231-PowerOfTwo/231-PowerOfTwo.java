// Last updated: 09/07/2026, 15:10:39
class Solution {
    public boolean isPowerOfTwo(int n) {
        int count=0;
        if(n<1) return false;
        for(int i=0; i<32; i++) {
            if((n&1)==1) count++;
            n=n>>1;
        }
        if(count==1) return true;
        else return false;
    }
}