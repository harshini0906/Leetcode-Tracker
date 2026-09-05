// Last updated: 05/09/2026, 20:05:22
class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int t=0;
        int curr=0;
        for(int r:requests) {
            t+=Math.abs(r-curr);
            curr=r;
        }
        return t;
    }
}