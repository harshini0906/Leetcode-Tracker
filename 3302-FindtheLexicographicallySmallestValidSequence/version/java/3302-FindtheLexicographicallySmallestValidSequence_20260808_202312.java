// Last updated: 08/08/2026, 20:23:12
1class Solution {
2    public int[] validSequence(String word1, String word2) {
3        int n = word1.length();
4        int m = word2.length();
5        int[] last = new int[m];
6        java.util.Arrays.fill(last, -1);
7        int i = n - 1;
8        int j = m - 1;
9        while (i >= 0 && j >= 0) {
10            if (word1.charAt(i) == word2.charAt(j)) {
11                last[j] = i;
12                --j;
13            }
14            --i;
15        }
16        int[] ans = new int[m];
17        int size = 0;
18        boolean canSkip = true;
19        j = 0;
20        for (i = 0; i < n && j < m; ++i) {
21            if (word1.charAt(i) == word2.charAt(j)) {
22                ans[size++] = i;
23                ++j;
24            }
25            else if (canSkip &&
26                     (j == m - 1 || i < last[j + 1])) {
27                canSkip = false;
28                ans[size++] = i;
29                ++j;
30            }
31        }
32        if (j == m) {
33            return ans;
34        }
35        return new int[0];
36    }
37}