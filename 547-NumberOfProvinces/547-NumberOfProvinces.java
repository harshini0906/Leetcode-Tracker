// Last updated: 09/07/2026, 15:09:14
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int count=0;
        for(int i=0; i<n; i++) {
            if(visited[i]==false) {
                count++;
                bfs(i,isConnected,n,visited);
            }
        }
        return count;
    }
    void bfs(int sv, int[][] isConnected, int n, boolean[] visited) {
        Queue<Integer> q=new LinkedList<>();
        q.add(sv);
        visited[sv]=true;
        while(q.size()>0) {
            int curr=q.poll();
            for(int i=0;i<n;i++) {
                if(isConnected[curr][i]==1 && visited[i]==false) {
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }
}