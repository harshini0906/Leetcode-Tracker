// Last updated: 09/10/2026, 15:39:51
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> res = new ArrayList<String>();
4        recurse(res, 0, 0, "", n);
5        return res;
6    }
7    public void recurse(List<String> res, int left, int right, String s, int n) {
8        if (s.length() == n * 2) {
9            res.add(s);
10            return;
11        }
12        if (left < n) recurse(res, left + 1, right, s + "(", n);
13        if (right < left) recurse(res, left, right + 1, s + ")", n);
14
15    }
16}