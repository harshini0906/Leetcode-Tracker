// Last updated: 11/07/2026, 16:25:11
1class Solution {
2    int ans=0;
3    public int countCompleteComponents(int n, int[][] edges) {
4        List<List<Integer>> adj=new ArrayList<>();
5        for(int i=0;i<n;i++) {
6            adj.add(new ArrayList<>());
7        }
8        int e=edges.length;
9        for(int i=0;i<e;i++){
10            int sv=edges[i][0];
11            int ev=edges[i][1];
12            adj.get(sv).add(ev);
13            adj.get(ev).add(sv);
14        }
15        boolean[] visited= new boolean[n];
16        for(int i=0; i<n; i++) {
17            if(visited[i]==false) {
18                bfs(adj,visited,n,i);
19            }
20        }
21        return ans;
22    }
23    void bfs(List<List<Integer>> adj, boolean[] visited, int n, int sv) {
24        Queue<Integer> q=new LinkedList<>();
25        q.add(sv);
26        visited[sv]=true;
27        int c=0;
28        int edge=0;
29        while(q.size()>0) {
30            int curr=q.poll();
31            c++;
32            for(int i : adj.get(curr)) {
33                if(visited[i]==false) {
34                    q.add(i);
35                    visited[i]=true;
36                }
37                edge++;
38            }
39        }
40        if(c*(c-1)==edge) ans++;
41    }
42}