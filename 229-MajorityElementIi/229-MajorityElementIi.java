// Last updated: 09/07/2026, 15:10:41
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0; i<n;i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        int m=n/3;
        List<Integer> ls=new ArrayList<>();
        for(Map.Entry<Integer,Integer> en:mp.entrySet()) {
            if(en.getValue()>m) ls.add(en.getKey());
        }
        return ls;
    }
}