// Last updated: 09/07/2026, 15:10:15
class Solution {
    public int minPatches(int[] nums, int n) {
        long miss = 1;
        int result = 0;
        int i = 0;

        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                miss += nums[i];
                i++;
            } else {
                miss += miss;
                result++;
            }
        }

        return result;
    }
}