// Last updated: 05/09/2026, 20:06:04
class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int min=Integer.MAX_VALUE;
        for(int r=0; r<n; r++) {
            int in=0;
            for(int i=0; i<n/2; i++) {
                char l=s.charAt((r+i)%n);
                char ri=s.charAt((r+n-1-i)%n);
                int diff1=(ri-l+26)%26;
                int diff2=(l-ri+26)%26;
                in+=Math.min(diff1,diff2);
            }
            min=Math.min(min,r+in);
        }
        return min;
    }
}