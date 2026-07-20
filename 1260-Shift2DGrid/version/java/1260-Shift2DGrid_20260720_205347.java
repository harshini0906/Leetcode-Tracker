// Last updated: 20/07/2026, 20:53:47
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m=grid.length;
4        int n=grid[0].length;
5        int t=m*n;
6        k%=t;
7        List<List<Integer>> ans=new ArrayList<>();
8        for(int i=0; i<m; i++) {
9            List<Integer> row=new ArrayList<>();
10            for(int j=0; j<n; j++) row.add(0);
11            ans.add(row);
12        }
13        for(int i=0; i<m; i++) {
14            for(int j=0; j<n; j++) {
15                int oi=i*n+j;
16                int ni=(oi+k)%t;
17                int nr=ni/n;
18                int nc=ni%n;
19                ans.get(nr).set(nc,grid[i][j]);
20            }
21        }
22        return ans;
23    }
24}