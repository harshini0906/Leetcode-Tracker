// Last updated: 02/09/2026, 16:23:11
1class Solution {
2    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
3        if(n == 1) return Collections.singletonList(0);
4        
5        int ind[] = new int[n];
6        Map<Integer, List<Integer>> map = new HashMap();
7        for(int[] edge: edges) {
8            ind[edge[0]]++;
9            ind[edge[1]]++;
10            map.putIfAbsent(edge[0], new ArrayList());
11            map.putIfAbsent(edge[1], new ArrayList());
12            map.get(edge[0]).add(edge[1]);
13            map.get(edge[1]).add(edge[0]);
14        }
15
16        Queue<Integer> queue = new LinkedList();
17        for(int i=0;i<ind.length;i++) {
18            if(ind[i] == 1) {
19                queue.add(i);
20            }
21        }
22
23        int processed = 0;
24        while(n - processed > 2) {
25            int size = queue.size();
26            processed += size;
27            for(int i=0;i<size;i++) {
28                int poll = queue.poll();
29                for(int adj: map.get(poll)) {
30                    if(--ind[adj] == 1) {
31                        queue.add(adj);
32                    }
33                }
34            }
35        }
36
37        List<Integer> list = new ArrayList();
38        list.addAll(queue);
39        return list;
40    }
41}