// Last updated: 09/07/2026, 15:09:43
class Solution {
    public int countSegments(String s) {
        if (s == null || s.trim().isEmpty()) return 0;
        String[] words = s.trim().split("\\s+");
        return words.length;
    }
}