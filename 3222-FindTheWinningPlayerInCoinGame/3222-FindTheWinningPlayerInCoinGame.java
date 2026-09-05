// Last updated: 05/09/2026, 20:08:09
class Solution {
    public String winningPlayer(int x, int y) {
        int turn=1;
        while(x>=1 && y>=4) {
            x-=1;
            y-=4;
            turn++;
        }
        if (turn%2==0) return "Alice";
        else return "Bob";
    }
}