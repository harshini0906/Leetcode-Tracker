// Last updated: 09/07/2026, 15:06:44
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum=arrivalTime + delayedTime;
        if(sum<24)
            return sum;
        else 
            return sum%24;
    }
}