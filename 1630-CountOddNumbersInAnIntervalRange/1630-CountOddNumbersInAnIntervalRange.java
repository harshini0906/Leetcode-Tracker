// Last updated: 09/07/2026, 15:07:32
class Solution {
    public int countOdds(int low, int high) {
        int n=high-low+1;
        if(low%2!=0 && high%2!=0) return n/2+1;
        else return n/2;
    }
}