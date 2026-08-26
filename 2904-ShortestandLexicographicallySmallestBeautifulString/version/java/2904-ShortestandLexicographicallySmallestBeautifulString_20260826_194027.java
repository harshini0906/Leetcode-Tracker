// Last updated: 26/08/2026, 19:40:27
1class Solution {
2    public String shortestBeautifulSubstring(String s, int k) {
3        String ans = "";
4        int n = s.length();
5        for (int i = 0; i < n; i++) {
6            int oneCnt = 0;
7            StringBuilder cur = new StringBuilder();
8            for (int j = i; j < n; j++) {
9                cur.append(s.charAt(j));
10                if (s.charAt(j) == '1')
11                    oneCnt++;
12                if (oneCnt > k)
13                    break;
14                if (oneCnt == k) {
15                    String curStr = cur.toString();
16                    if (ans.isEmpty() ||
17                        curStr.length() < ans.length() ||
18                        (curStr.length() == ans.length() && curStr.compareTo(ans) < 0)) {
19                        ans = curStr;
20                    }
21                }
22            }
23        }
24        return ans;
25    }
26}