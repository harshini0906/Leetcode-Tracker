// Last updated: 19/07/2026, 10:45:13
1class Solution {
2    public boolean canCross(int[] stones) {
3        Map<Integer, Set<Integer>> dp = new HashMap<>();
4        for (int stone : stones) {
5            dp.put(stone, new HashSet<>());
6        }
7        dp.get(0).add(0);
8        for (int stone : stones) {
9            for (int jump : dp.get(stone)) {
10                for (int jumpDistance : new int[] {jump - 1, jump, jump + 1}) {
11                    if (jumpDistance > 0 && dp.containsKey(stone + jumpDistance)) {
12                        dp.get(stone + jumpDistance).add(jumpDistance);
13                    }
14                }
15            }
16        }
17        return !dp.get(stones[stones.length - 1]).isEmpty();        
18    }
19}