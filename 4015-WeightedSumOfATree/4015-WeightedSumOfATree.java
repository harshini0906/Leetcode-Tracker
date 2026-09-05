// Last updated: 05/09/2026, 20:05:59
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        int[] depth = new int[n];
        int h =0;
        for(int i=0;i<n;i++) {
            h = Math.max(h, getDepth(i, parent, depth));
        }
        long totalSum = 0;
        for(int i=0;i<n;i++){
            long weight = (long) nums[i] * (h - depth[i] + 1);
            totalSum += weight;
        }
        return totalSum;
    }
    private int getDepth(int i, int[] parent, int[] depth) {
        if(i == -1) {
            return 0;
        }
        if(depth[i] !=0) {
            return depth[i];
        }
        depth[i] = 1 + getDepth(parent[i], parent, depth);
        return depth[i];
    }
}