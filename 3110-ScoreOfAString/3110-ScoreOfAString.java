// Last updated: 05/09/2026, 20:08:12
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