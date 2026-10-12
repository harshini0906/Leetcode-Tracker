// Last updated: 12/10/2026, 20:08:00
1class Solution {
2    public int lengthOfLastWord(String s) {
3        s=s.trim();
4        String last = s.substring(s.lastIndexOf(' ') + 1);
5        int count=last.length();
6        return count;
7    }
8}