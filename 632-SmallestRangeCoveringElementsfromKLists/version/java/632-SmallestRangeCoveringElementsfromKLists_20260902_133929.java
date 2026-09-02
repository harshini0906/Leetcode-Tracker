// Last updated: 02/09/2026, 13:39:29
1class Solution {
2    public int[] smallestRange(List<List<Integer>> nums) {
3        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
4        int curMax = Integer.MIN_VALUE;
5        for (int i = 0; i < nums.size(); i++) {
6            minHeap.offer(new int[]{nums.get(i).get(0), i, 0});
7            curMax = Math.max(curMax, nums.get(i).get(0));
8        }
9        int[] smallRange = new int[]{0, Integer.MAX_VALUE};
10        while (true) {
11            int[] curr = minHeap.poll();
12            int curMin = curr[0], listIdx = curr[1], elemIdx = curr[2];
13            if (curMax - curMin < smallRange[1] - smallRange[0]) {
14                smallRange[0] = curMin;
15                smallRange[1] = curMax;
16            }
17            if (elemIdx + 1 < nums.get(listIdx).size()) {
18                int nextVal = nums.get(listIdx).get(elemIdx + 1);
19                minHeap.offer(new int[]{nextVal, listIdx, elemIdx + 1});
20                curMax = Math.max(curMax, nextVal);
21            } else {
22                break;
23            }
24        }
25        return smallRange;
26    }
27}