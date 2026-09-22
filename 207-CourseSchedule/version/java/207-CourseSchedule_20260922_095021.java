// Last updated: 22/09/2026, 09:50:21
1class Solution {
2    public boolean canFinish(int n, int[][] prerequisites) {
3        List<Integer>[] adj = new List[n];
4        int[] indegree = new int[n];
5        List<Integer> ans = new ArrayList<>();
6        for (int[] pair : prerequisites) {
7            int course = pair[0];
8            int prerequisite = pair[1];
9            if (adj[prerequisite] == null) {
10                adj[prerequisite] = new ArrayList<>();
11            }
12            adj[prerequisite].add(course);
13            indegree[course]++;
14        }
15        Queue<Integer> queue = new LinkedList<>();
16        for (int i = 0; i < n; i++) {
17            if (indegree[i] == 0) {
18                queue.offer(i);
19            }
20        }
21        while (!queue.isEmpty()) {
22            int current = queue.poll();
23            ans.add(current);
24            if (adj[current] != null) {
25                for (int next : adj[current]) {
26                    indegree[next]--;
27                    if (indegree[next] == 0) {
28                        queue.offer(next);
29                    }
30                }
31            }
32        }
33        return ans.size() == n;
34    }
35}