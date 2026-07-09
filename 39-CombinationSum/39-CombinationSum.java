// Last updated: 09/07/2026, 15:13:29
class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(new ArrayList<>(),candidates,target,0);
        return res;
    }
    void helper(List<Integer> curr,int[] nums, int target, int idx) {
        if(target==0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0) return;
        for(int i=idx; i<nums.length; i++) {
            curr.add(nums[i]);
            helper(curr,nums,target-nums[i],i);
            curr.remove(curr.size()-1);
        }
    }
}