// Last updated: 09/07/2026, 15:06:52
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