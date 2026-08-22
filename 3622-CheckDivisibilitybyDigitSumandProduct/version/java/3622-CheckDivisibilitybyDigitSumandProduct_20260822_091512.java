// Last updated: 22/08/2026, 09:15:12
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sumDigit = 0;
4        int productDigit = 1;
5        int num = n;
6        while (num > 0) {
7            sumDigit += num % 10;
8            productDigit *= num % 10;
9            num /= 10;
10        }
11        return n % (sumDigit + productDigit) == 0;
12    }
13}