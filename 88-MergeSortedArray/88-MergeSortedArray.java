// Last updated: 09/07/2026, 15:12:47
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0,i=m; j<n;j++) {
            nums1[i]=nums2[j];
            i++;
        }   
        Arrays.sort(nums1);
    }
}