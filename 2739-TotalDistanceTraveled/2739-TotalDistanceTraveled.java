// Last updated: 05/09/2026, 20:08:56
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int total=0;
        while(mainTank>=5) {
            total+=50;
            mainTank-=5;
            if(additionalTank>=1) {
                mainTank++;
                additionalTank--;
            }
        }
        return total+(mainTank*10);
    }
}