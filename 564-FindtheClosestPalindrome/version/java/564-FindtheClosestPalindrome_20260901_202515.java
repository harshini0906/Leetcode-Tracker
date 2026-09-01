// Last updated: 01/09/2026, 20:25:15
1class Solution {
2    public String nearestPalindromic(String n) {
3        int length = n.length();
4        Set<String> candidates = new HashSet<>();
5        if (n.equals("1")) return "0";
6        String prefix = n.substring(0, (length + 1) / 2);
7        long prefixNumber = Long.parseLong(prefix);
8        for (long i : new long[] {-1, 0, 1}) {
9            String newPrefix = Long.toString(prefixNumber + i);
10            String candidate;
11            if (length % 2 == 0) {
12                candidate = newPrefix + new StringBuilder(newPrefix).reverse().toString();
13            } else {
14                candidate = newPrefix + new StringBuilder(newPrefix.substring(0, newPrefix.length() - 1)).reverse().toString();
15            }
16            candidates.add(candidate);
17        }
18        candidates.add(Long.toString((long)Math.pow(10, length - 1) - 1));
19        candidates.add(Long.toString((long)Math.pow(10, length) + 1));
20        candidates.remove(n);
21        String closestPalindrome = "";
22        long minDifference = Long.MAX_VALUE;
23        long num = Long.parseLong(n);
24        for (String candidate : candidates) {
25            long candidateNum = Long.parseLong(candidate);
26            long difference = Math.abs(candidateNum - num);
27            if (difference < minDifference || (difference == minDifference && candidateNum < Long.parseLong(closestPalindrome))) {
28                minDifference = difference;
29                closestPalindrome = candidate;
30            }
31        }
32        return closestPalindrome;
33    }
34}