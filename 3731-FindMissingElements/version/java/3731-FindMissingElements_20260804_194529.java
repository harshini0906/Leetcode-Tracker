// Last updated: 04/08/2026, 19:45:29
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        HashSet<Integer> seen = new HashSet<>();
4        int mn = Integer.MAX_VALUE;
5        int mx = Integer.MIN_VALUE;
6        for (int num : nums) {
7            seen.add(num);
8            mn = Math.min(mn, num);
9            mx = Math.max(mx, num);
10        }
11        List<Integer> ans = new ArrayList<>();
12        for (int x = mn; x <= mx; x++) {
13            if (!seen.contains(x)) {
14                ans.add(x);
15            }
16        }
17        return ans;
18    }
19}