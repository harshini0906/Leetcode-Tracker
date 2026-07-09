// Last updated: 09/07/2026, 15:07:24
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int ans=0;
        for(int i=0; i<boxTypes.length; i++) {
            int num=boxTypes[i][0];
            int q=boxTypes[i][1];
            int boxtake=Math.min(num,truckSize);
            truckSize=truckSize-boxtake;
            ans+=boxtake*q;
        }
        return ans;
    }
}