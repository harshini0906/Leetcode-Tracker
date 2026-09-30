// Last updated: 30/09/2026, 21:14:27
1class Solution {
2    public int myAtoi(String s) {
3        s = s.trim();
4        int sign = 1, i = 0;
5        long res = 0; 
6        if (s.length() == 0) return 0;
7        if (s.charAt(0) == '-') { sign = -1; i++; }
8        else if (s.charAt(0) == '+') { i++; }
9        while (i < s.length()) {
10            char ch = s.charAt(i);
11            if (ch < '0' || ch > '9') break; 
12            res = res * 10 + (ch - '0'); 
13            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; 
14            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
15            i++;
16        }
17        return (int) (sign * res);
18    }
19}