// Last updated: 28/07/2026, 13:49:25
1class Solution {
2  public int countDigitOne(int n) {
3    if (n <= 0) return 0;
4    int q = n, x = 1, ans = 0;
5    do {
6        int digit = q % 10;
7        q /= 10;
8        ans += q * x;
9        if (digit == 1) ans += n % x + 1;
10        if (digit >  1) ans += x;
11        x *= 10;
12    } while (q > 0);
13    return ans;
14  }
15}