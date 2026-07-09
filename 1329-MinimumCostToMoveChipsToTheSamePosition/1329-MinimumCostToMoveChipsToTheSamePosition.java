// Last updated: 09/07/2026, 15:07:56
class Solution {
    public int minCostToMoveChips(int[] position) {
        int evencount=0;
        int oddcount=0;
        for(int pos:position) {
            if(pos%2==0) evencount++;
            else oddcount++;
        }
        return evencount<oddcount ? evencount:oddcount;
    }
}