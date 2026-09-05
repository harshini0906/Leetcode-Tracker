// Last updated: 05/09/2026, 20:05:28
class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer> vis=new HashSet<>();
        Set<Integer> in=new HashSet<>();
        if(nums.length>0) vis.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]) {
                if(vis.contains(nums[i])) in.add(nums[i]);
                else vis.add(nums[i]);

            }
        }
        return vis.size()-in.size();

    }
}