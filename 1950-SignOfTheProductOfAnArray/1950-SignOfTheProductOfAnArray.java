// Last updated: 09/07/2026, 15:07:22
class Solution {
    public int arraySign(int[] nums) {
        int prod=1;
        for(int x:nums) {
            if (prod>=1) prod=1;
            if (prod<0) prod=-1;
            prod*=x;
        }
        if(prod>=1) return 1;
        else if(prod<0) return -1;
        else return 0;
    }
}