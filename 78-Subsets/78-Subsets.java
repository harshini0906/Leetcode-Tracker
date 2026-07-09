// Last updated: 09/07/2026, 15:12:52
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        allsubsets(0,nums,temp);
        return ans;
    }
    void allsubsets(int i, int[] nums, List<Integer> temp) {
        if(i>=nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        allsubsets(i+1,nums,temp);
        temp.remove(temp.size()-1);
        allsubsets(i+1,nums,temp);
    }
}