// Last updated: 05/09/2026, 20:09:24
class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        for(int x:nums) {
            esum+=x;
        }
        int dsum=0;
        for(int y:nums) {
            while(y>0) {
                int last=y%10;
                dsum+=last;
                y=y/10;
            }
        }
        return Math.abs(esum-dsum);
    }
}