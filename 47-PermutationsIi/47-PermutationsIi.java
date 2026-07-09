// Last updated: 09/07/2026, 15:13:21
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        permutations(0,nums);
        return ans;
    }
    void permutations(int i, int[] nums) {
        if(i==nums.length-1) {
            List<Integer> temp=new ArrayList<>();
            for(i=0; i<nums.length; i++) {
                temp.add(nums[i]);
            }
            ans.add(temp);
        }
        HashSet<Integer> mp=new HashSet<>();
        for(int j=i; j<nums.length; j++) {
            if(mp.contains(nums[j])) continue;
            mp.add(nums[j]);
            int swap=nums[i];
            nums[i]=nums[j];
            nums[j]=swap;
            permutations(i+1,nums);
            swap=nums[i];
            nums[i]=nums[j];
            nums[j]=swap;
        }
    }
}
