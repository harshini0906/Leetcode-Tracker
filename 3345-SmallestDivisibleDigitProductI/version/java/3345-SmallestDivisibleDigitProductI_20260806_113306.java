// Last updated: 06/08/2026, 11:33:06
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while(productOfDigits(n) % t != 0){
4            n++;
5        }
6        return n;
7    }
8    private int productOfDigits(int num){
9        int product = 1;
10        while(num != 0){
11            product *= num % 10;
12            num /= 10;
13        }
14        return product;
15    }
16}