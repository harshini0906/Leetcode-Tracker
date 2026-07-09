// Last updated: 09/07/2026, 15:06:02
class Solution {
    public boolean consecutiveSetBits(int n) {
        String str=Integer.toBinaryString(n);
        int ans=0;
        int x=str.length();
        for(int i=0; i<x-1; i++) {
            if(str.charAt(i)=='1' && str.charAt(i+1)=='1') ans++;
        }
        return ans==1;
    }
}