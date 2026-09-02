// Last updated: 02/09/2026, 09:23:20
1class Solution {
2    public int minSwap(int[] A, int[] B) {
3        int n = A.length;
4        int swap = 1, notSwap = 0;
5        for (int i = 1; i < n; i++) {
6            int newSwap = Integer.MAX_VALUE;
7            int newNotSwap = Integer.MAX_VALUE;
8            if (A[i - 1] < A[i] && B[i - 1] < B[i]) {
9                newNotSwap = notSwap;      
10                newSwap = swap + 1; 
11            }
12            if (A[i - 1] < B[i] && B[i - 1] < A[i]) {
13                newNotSwap = Math.min(newNotSwap, swap);  
14                newSwap = Math.min(newSwap, notSwap + 1);      
15            }
16            swap = newSwap;
17            notSwap = newNotSwap;
18        }
19        return Math.min(swap, notSwap);
20    }
21}