// Last updated: 24/07/2026, 19:00:55
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m= matrix.length, n= matrix[0].length;
4        int matrix2[][]= new int[m][n];
5        for(int i=0;i<m;i++){
6            for(int j=0;j<n;j++)
7                matrix2[i][j]=matrix[i][j];
8        }
9        for(int i=0;i<m;i++){
10            for(int j=0;j<n;j++){
11                if(matrix[i][j]==0){
12                    for(int k=0;k<n;k++)
13                        matrix2[i][k]=0;
14                    for(int k=0;k<m;k++)
15                        matrix2[k][j]=0;
16                }
17            }
18        }
19        for(int i=0;i<m;i++){
20            for(int j=0;j<n;j++)
21                matrix[i][j]=matrix2[i][j];
22        }
23    }
24}