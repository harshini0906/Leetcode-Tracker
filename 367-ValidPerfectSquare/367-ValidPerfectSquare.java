// Last updated: 09/07/2026, 15:10:08
class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1, j=num;
        int mid;
        while(i<=j) {
            mid=(i+j)/2;
            if((long)mid*mid==num) return true;
            else if((long)mid*mid<num) i=mid+1;
            else j=mid-1;
        }
        return false;
    }
}