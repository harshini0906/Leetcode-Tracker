// Last updated: 12/07/2026, 21:35:43
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int[] sorted = arr.clone();
4
5        Arrays.sort(sorted);
6
7        HashMap<Integer, Integer> rank = new HashMap<>();
8        int currentRank = 1;
9
10        for (int num : sorted) {
11            if (!rank.containsKey(num)) {
12                rank.put(num, currentRank++);
13            }
14        }
15
16        for (int i = 0; i < arr.length; i++) {
17            arr[i] = rank.get(arr[i]);
18        }
19
20        return arr;
21    }
22}