// Last updated: 12/10/2026, 20:07:44
1class Solution {
2    List<List<Integer>> ans=new ArrayList<>();
3    public List<List<Integer>> permuteUnique(int[] nums) {
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
15        HashSet<Integer> mp=new HashSet<>();
16        for(int j=i; j<nums.length; j++) {
17            if(mp.contains(nums[j])) continue;
18            mp.add(nums[j]);
19            int swap=nums[i];
20            nums[i]=nums[j];
21            nums[j]=swap;
22            permutations(i+1,nums);
23            swap=nums[i];
24            nums[i]=nums[j];
25            nums[j]=swap;
26        }
27    }
28}
29