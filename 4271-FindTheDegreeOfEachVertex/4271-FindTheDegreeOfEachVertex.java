// Last updated: 09/07/2026, 15:06:01
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int ans[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++) {
            int count=0;
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j]==1) count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}