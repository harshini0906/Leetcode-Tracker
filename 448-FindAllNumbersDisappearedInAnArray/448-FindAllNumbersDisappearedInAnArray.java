// Last updated: 09/07/2026, 15:09:34
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> result=new ArrayList<>();
        boolean[] seen=new boolean[n+1];
        for(int num:nums) {
            seen[num]=true;
        }
        for(int i=1; i<=n; i++) {
            if(!seen[i]) result.add(i);
        }
        return result;
    }
}