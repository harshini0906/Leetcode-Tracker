// Last updated: 05/09/2026, 20:08:52
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int x:hours) {
            if(x>=target) count++;
        }
        return count;
    }
}