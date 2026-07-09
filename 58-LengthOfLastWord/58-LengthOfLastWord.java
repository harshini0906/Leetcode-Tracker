// Last updated: 09/07/2026, 15:13:11
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String last = s.substring(s.lastIndexOf(' ') + 1);
        int count=last.length();
        return count;
    }
}