// Last updated: 09/07/2026, 15:07:27
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int i=0, j=0;
        for(int k=1;k<=mat.length;k++) {
            sum+=mat[i][j];
            i++;
            j++;
        }
        int n=mat.length;
        i=0; j=n-1;
        for(int k=1; k<=n; k++) {
            if (i!=j) sum+=mat[i][j];
            i++;
            j--;
        }
        return sum;
    }
}