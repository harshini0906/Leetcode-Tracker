// Last updated: 14/10/2026, 19:37:05
1class Solution {
2    public int maxProfit(int[] prices) {
3        int maxp = 0;
4        int minBuyPrice = prices[0];
5        for(int i = 1; i < prices.length; i++) {
6            int sellPrice = prices[i];
7            if(sellPrice > minBuyPrice) {
8                int profit = sellPrice - minBuyPrice;
9                if(profit > maxp) maxp = profit;
10            }else{
11                minBuyPrice = sellPrice;
12            }
13        }
14        return maxp;
15        
16    }
17}