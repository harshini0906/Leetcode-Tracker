// Last updated: 09/07/2026, 15:06:36
class Solution {
    int ans=0;
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        int e=edges.length;
        for(int i=0;i<e;i++){
            int sv=edges[i][0];
            int ev=edges[i][1];
            adj.get(sv).add(ev);
            adj.get(ev).add(sv);
        }
        boolean[] visited= new boolean[n];
        for(int i=0; i<n; i++) {
            if(visited[i]==false) {
                bfs(adj,visited,n,i);
            }
        }
        return ans;
    }
    void bfs(List<List<Integer>> adj, boolean[] visited, int n, int sv) {
        Queue<Integer> q=new LinkedList<>();
        q.add(sv);
        visited[sv]=true;
        int c=0;
        int edge=0;
        while(q.size()>0) {
            int curr=q.poll();
            c++;
            for(int i : adj.get(curr)) {
                if(visited[i]==false) {
                    q.add(i);
                    visited[i]=true;
                }
                edge++;
            }
        }
        if(c*(c-1)==edge) ans++;
    }
}