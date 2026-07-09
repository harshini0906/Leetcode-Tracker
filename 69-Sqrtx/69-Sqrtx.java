// Last updated: 09/07/2026, 15:13:00
class Solution {
    public int mySqrt(int x) {
        int i=1, j=x;
        int mid;
        int ans=0;
        while(i<=j) {
            mid=i+(j-i)/2;
            if((long)mid*mid==x) return mid;
            else if((long)mid*mid<x){
                ans=mid;
                i=mid+1;
            } 
            else j=mid-1;
        }
        return ans;
    }
}