// Last updated: 15/08/2026, 20:42:33
1class Solution {
2    public int minOperations(String s) {
3        int n=s.length();
4        int min=Integer.MAX_VALUE;
5        for(int r=0; r<n; r++) {
6            int in=0;
7            for(int i=0; i<n/2; i++) {
8                char l=s.charAt((r+i)%n);
9                char ri=s.charAt((r+n-1-i)%n);
10                int diff1=(ri-l+26)%26;
11                int diff2=(l-ri+26)%26;
12                in+=Math.min(diff1,diff2);
13            }
14            min=Math.min(min,r+in);
15        }
16        return min;
17    }
18}