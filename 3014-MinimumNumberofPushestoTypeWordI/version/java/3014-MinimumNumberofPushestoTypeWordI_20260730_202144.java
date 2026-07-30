// Last updated: 30/07/2026, 20:21:44
1class Solution {
2    public int minimumPushes(String word) {
3        int n = word.length();
4        int blocks = n / 8;
5        return (blocks * (blocks + 1) * 4) + (n % 8) * (blocks + 1);
6    }
7}