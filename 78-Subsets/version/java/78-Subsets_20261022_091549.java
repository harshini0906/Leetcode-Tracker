// Last updated: 22/10/2026, 09:15:49
1class Solution {
2    List<List<Integer>> ans=new ArrayList<>();
3    public List<List<Integer>> subsets(int[] nums) {
4        List<Integer> temp=new ArrayList<>();
5        allsubsets(0,nums,temp);
6        return ans;
7    }
8    void allsubsets(int i, int[] nums, List<Integer> temp) {
9        if(i>=nums.length) {
10            ans.add(new ArrayList<>(temp));
11            return;
12        }
13        temp.add(nums[i]);
14        allsubsets(i+1,nums,temp);
15        temp.remove(temp.size()-1);
16        allsubsets(i+1,nums,temp);
17    }
18}