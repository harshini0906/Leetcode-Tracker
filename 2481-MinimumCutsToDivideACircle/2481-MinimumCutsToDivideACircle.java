// Last updated: 05/09/2026, 20:09:31
class Solution {
    public int numberOfCuts(int n) {
        if (n==1) {
            return 0;
        }
        if(n%2==0) {
            return n/2;
        }
        else {
            return n;
        }
    }
}