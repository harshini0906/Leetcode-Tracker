// Last updated: 09/07/2026, 15:07:14
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        int m=edges.length;
        for(int i=0;i<m;i++){
            int sv=edges[i][0];
            int ev=edges[i][1];
            adj.get(sv).add(ev);
            adj.get(ev).add(sv);
        }
        boolean x=bfs(n,adj,source,destination);
        return x;
    }
    boolean bfs(int n,List<List<Integer>> adj,int source,int destination) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[n];
        q.add(source);
        visited[source]=true;
        while(q.size()>0) {
            int curr=q.poll();
            ans.add(curr);
            int m=adj.get(curr).size();
            for(int i=0;i<m;i++) {
                int x=adj.get(curr).get(i);
                if(visited[x]==false) {
                    q.add(x);
                    visited[x]=true;
                }
            }
        }
        if(visited[destination]==true) return true;
        else return false;
    }
}