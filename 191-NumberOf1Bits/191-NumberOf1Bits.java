// Last updated: 09/07/2026, 15:11:12
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0) {
            n=(n&(n-1)); 
            count++;
        }
        
        return count;
    }
}