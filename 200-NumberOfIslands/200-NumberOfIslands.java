// Last updated: 09/07/2026, 15:11:00
class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int ans=0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j]=='1' && visited[i][j]==false) {
                    ans++;
                    bfs(i,j,visited,grid,m,n);
                }
            }
        }
        return ans;
    }
    void bfs(int i, int j, boolean[][] visited, char[][] grid, int m, int n) {
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i,j});
        visited[i][j]=true;
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        while(q.size()>0) {
            int[] curr=q.poll();
            int x=curr[0];
            int y=curr[1];
            for(int k=0; k<4; k++) {
                int nextrow=x+directions[k][0];
                int nextcol=y+directions[k][1];
                if(nextrow<m && nextrow>=0 && nextcol<n && nextcol>=0 && 
                visited[nextrow][nextcol]==false && grid[nextrow][nextcol]=='1') {
                    q.add(new int[]{nextrow,nextcol});
                    visited[nextrow][nextcol]=true;
                }
            }
        }
    }
}