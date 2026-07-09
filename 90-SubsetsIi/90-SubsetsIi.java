// Last updated: 09/07/2026, 15:12:45
class Solution {
    Set<List<Integer>> ans=new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp=new ArrayList<>();
        allsubsets(0,nums,temp);
        return new ArrayList<>(ans);
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