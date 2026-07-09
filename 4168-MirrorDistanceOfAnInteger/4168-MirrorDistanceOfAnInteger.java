// Last updated: 09/07/2026, 15:06:11
class Solution {
    public int mirrorDistance(int n) {
        int org=n;
        int last,sum=0;
        while(n!=0) {
            last=n%10;
            sum=sum*10+last;
            n/=10;
        }
        return Math.abs(org-sum);
    }
}