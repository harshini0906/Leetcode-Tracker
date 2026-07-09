// Last updated: 09/07/2026, 15:07:30
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            pairs+=freq.getOrDefault(nums[i],0);
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        return pairs;
    }
}