// Last updated: 09/07/2026, 15:06:27
class Solution {
    public int differenceOfSums(int n, int m) {
        int ncount=0,count=0;
        for(int i=1; i<=n; i++) {
            if(i%m!=0) ncount+=i;
            else count+=i;
        }
        return ncount-count;
    }
}