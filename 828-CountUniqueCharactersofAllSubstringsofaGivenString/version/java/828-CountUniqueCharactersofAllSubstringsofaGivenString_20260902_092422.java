// Last updated: 02/09/2026, 09:24:22
1class Solution {
2    public int uniqueLetterString(String s) {
3        int n = s.length();
4        int[] left = new int[n];
5        int[] right = new int[n];
6        int[] prev = new int[26];
7        Arrays.fill(prev, -1);
8        for(int i = 0; i < n; i++){
9            int idx = s.charAt(i) - 'A';
10            left[i] = prev[idx];
11            prev[idx] = i;
12        }
13        Arrays.fill(prev, n);
14        for(int i = n - 1; i >= 0; i--){
15            int idx = s.charAt(i) - 'A';
16            right[i] = prev[idx];
17            prev[idx] = i;
18        }
19        long ans = 0;
20        for(int i = 0; i < n; i++){
21            ans += (long)(i - left[i]) * (right[i] - i);
22        }
23        return (int) ans;
24    }
25}