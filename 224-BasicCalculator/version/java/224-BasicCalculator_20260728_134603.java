// Last updated: 28/07/2026, 13:46:03
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> st = new Stack<>();
4        int ans = 0;
5        int num = 0;
6        int sign = 1;
7        for (int i = 0; i < s.length(); i++) {
8            char ch = s.charAt(i);
9
10            if (ch >= '0' && ch <= '9') {
11                num = num * 10 + (ch - '0');
12            }
13            else if (ch == '+') {
14                ans += sign * num;
15                num = 0;
16                sign = 1;
17            }
18            else if (ch == '-') {
19                ans += sign * num;
20                num = 0;
21                sign = -1;
22            }
23            else if (ch == '(') {
24                st.push(ans);
25                st.push(sign);
26
27                ans = 0;
28                sign = 1;
29            }
30            else if (ch == ')') {
31                ans += sign * num;
32                num = 0;
33                int prevSign = st.pop();
34                int prevAns = st.pop();
35                ans = prevAns + prevSign * ans;
36            }
37        }
38        ans += sign * num;
39        return ans;
40    }
41}