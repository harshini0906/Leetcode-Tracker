// Last updated: 12/10/2026, 20:07:17
1class Solution {
2    List<List<Integer>> ans=new ArrayList<>();
3    public List<List<Integer>> permute(int[] nums) {
4        permutations(0,nums);
5        return ans;
6    }
7    void permutations(int i, int[] nums) {
8        if(i==nums.length-1) {
9            List<Integer> temp=new ArrayList<>();
10            for(i=0; i<nums.length; i++) {
11                temp.add(nums[i]);
12            }
13            ans.add(temp);
14        }
15        for(int j=i; j<nums.length; j++) {
16            int swap=nums[i];
17            nums[i]=nums[j];
18            nums[j]=swap;
19            permutations(i+1,nums);
20            swap=nums[i];
21            nums[i]=nums[j];
22            nums[j]=swap;
23        }
24    }
25}