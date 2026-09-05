// Last updated: 05/09/2026, 20:08:35
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int blocks = n / 8;
        return (blocks * (blocks + 1) * 4) + (n % 8) * (blocks + 1);
    }
}