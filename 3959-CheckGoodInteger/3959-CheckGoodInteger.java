// Last updated: 05/09/2026, 20:06:07
class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0,ss=0,last;
        while(n>0) {
            last=n%10;
            ds+=last;
            ss+=last*last;
            n=n/10;
        }
        return (ss-ds)>=50;
    }
}