// Last updated: 29/08/2026, 17:45:40
1class Solution {
2    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
3        int n = nums.length;
4        int[] sorted = nums.clone();
5        Arrays.sort(sorted);
6        Map<Integer, List<Integer>> group = new HashMap<>();
7        Map<Integer, Integer> groupId = new HashMap<>();
8        Map<Integer, Integer> pos = new HashMap<>();
9        int id = 1;
10        group.computeIfAbsent(id, k -> new ArrayList<>()).add(sorted[0]);
11        groupId.put(sorted[0], id);
12        for(int i = 1; i < n; i++){
13            if(sorted[i] - sorted[i - 1] > limit){
14                id++;
15            }
16            group.computeIfAbsent(id, k -> new ArrayList<>()).add(sorted[i]);
17            groupId.put(sorted[i], id);
18        }
19        for(int i = 0; i < n; i++){
20            int grp = groupId.get(nums[i]);
21            int p = pos.getOrDefault(grp, 0);
22            nums[i] = group.get(grp).get(p);
23            pos.put(grp, p + 1);
24        }
25        return nums;
26    }
27}