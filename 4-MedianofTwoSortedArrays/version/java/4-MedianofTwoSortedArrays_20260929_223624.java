// Last updated: 29/09/2026, 22:36:24
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n=nums1.length;
4        int m=nums2.length;
5        int[] merged=new int[n+m];
6        int k=0;
7        for(int i=0; i<n; i++) merged[k++]=nums1[i];
8        for(int i=0; i<m; i++) merged[k++]=nums2[i];
9        Arrays.sort(merged);
10        int total=merged.length;
11        if(total%2==1) return (double) merged[total/2];
12        else {
13            int mid1=merged[total/2-1];
14            int mid2=merged[total/2];
15            return ((double) mid1+(double) mid2)/2.0;
16        }
17    }
18}