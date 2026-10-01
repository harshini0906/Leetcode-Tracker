// Last updated: 01/10/2026, 15:07:55
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        StringBuilder ans=new StringBuilder();
4        Arrays.sort(strs);
5        String f=strs[0];
6        String l=strs[strs.length-1];
7        for(int i=0; i<Math.min(f.length(),l.length());i++) {
8            if(f.charAt(i)!=l.charAt(i)) {
9                return ans.toString();
10            }
11            ans.append(f.charAt(i));
12        }
13        return ans.toString();
14    }
15}