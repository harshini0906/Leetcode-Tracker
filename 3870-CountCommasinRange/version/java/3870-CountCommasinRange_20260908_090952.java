// Last updated: 08/09/2026, 09:09:52
1class Solution {
2    public int countCommas(int n) {
3        long answer = 0;
4        long threshold = 1000;
5        while (threshold <= n) {
6            answer += n - threshold + 1;
7
8            threshold *= 1000;
9        }
10        return (int) answer;
11    }
12}