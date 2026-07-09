// Last updated: 09/07/2026, 15:06:22
class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=1; i<s.length(); i++) {
            int d=Math.abs(s.charAt(i)-s.charAt(i-1));
            score+=d;
        }
        return score;
    }
}