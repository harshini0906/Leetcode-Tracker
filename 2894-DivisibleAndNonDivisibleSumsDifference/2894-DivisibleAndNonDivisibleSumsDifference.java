// Last updated: 05/09/2026, 20:08:46
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