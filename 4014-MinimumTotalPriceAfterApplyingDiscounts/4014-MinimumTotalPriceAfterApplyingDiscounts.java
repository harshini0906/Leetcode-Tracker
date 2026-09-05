// Last updated: 05/09/2026, 20:05:46
import java.util.Arrays;
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double totalMinPrice = 0;
        int pIndex = prices.length - 1;
        int dIndex = discounts.length - 1;
        while (pIndex >=0 && dIndex >=0){
            double discountedPrice = prices[pIndex]*(100.0-discounts[dIndex])/100.0;
            totalMinPrice += discountedPrice;
            pIndex--;
            dIndex--;
        }
        while (pIndex >= 0) {
            totalMinPrice += prices[pIndex];
            pIndex--;
        }
        return totalMinPrice;
    }
}