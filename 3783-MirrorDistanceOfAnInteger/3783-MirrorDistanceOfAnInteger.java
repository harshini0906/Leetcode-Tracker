// Last updated: 05/09/2026, 20:06:39
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