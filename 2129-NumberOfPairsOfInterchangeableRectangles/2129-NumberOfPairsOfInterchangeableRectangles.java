// Last updated: 09/07/2026, 15:07:10
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long res=0;
        Map<Double,Integer>hm=new HashMap();
        for(int[] r:rectangles) {
            double ratio=(double)r[0]/r[1];
            res=res+hm.getOrDefault(ratio,0);
            hm.put(ratio,hm.getOrDefault(ratio,0)+1);
        }
        return res;
    }
}