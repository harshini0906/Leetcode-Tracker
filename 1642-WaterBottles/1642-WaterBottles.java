// Last updated: 09/07/2026, 15:07:29
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=numBottles;
        int empty=numBottles;
        while(empty>=numExchange) {
            int newD=empty/numExchange;
            empty=(empty%numExchange)+newD;
            drink+=newD;
        }
        return drink;
    }
}