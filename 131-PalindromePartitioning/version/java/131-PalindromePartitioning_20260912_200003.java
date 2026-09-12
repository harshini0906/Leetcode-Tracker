// Last updated: 12/09/2026, 20:00:03
1public class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> result = new ArrayList<>();
4        backtrack(s, 0, new ArrayList<>(), result);
5        return result;
6    }
7    private void backtrack(String s, int start, List<String> path, List<List<String>> result) {
8        if (start == s.length()) {
9            result.add(new ArrayList<>(path));
10            return;
11        }
12        for (int end = start + 1; end <= s.length(); end++) {
13            if (isPalindrome(s, start, end - 1)) {
14                path.add(s.substring(start, end));
15                backtrack(s, end, path, result);
16                path.remove(path.size() - 1);
17            }
18        }
19    }
20    private boolean isPalindrome(String s, int left, int right) {
21        while (left < right) {
22            if (s.charAt(left++) != s.charAt(right--)) {
23                return false;
24            }
25        }
26        return true;
27    }
28}