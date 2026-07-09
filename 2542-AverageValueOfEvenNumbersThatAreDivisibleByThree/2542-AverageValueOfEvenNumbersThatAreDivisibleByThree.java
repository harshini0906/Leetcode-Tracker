// Last updated: 09/07/2026, 15:07:00
class Solution {
    public int averageValue(int[] nums) {
        int sum=0,count=0;
        for(int x:nums) {
            if(x%2==0 && x%3==0) {
                sum+=x;
                count++;
            }
        }
        if(sum==0) return 0;
        return sum/count;
    }
}