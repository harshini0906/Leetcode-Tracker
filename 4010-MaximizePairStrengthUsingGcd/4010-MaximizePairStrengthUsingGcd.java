// Last updated: 05/09/2026, 20:05:37
class Solution {
    public long maxPairStrength(int[] nums) {
        int n=nums.length;
        long max=0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++){
                long a=nums[i], b=nums[j];
                while(b!=0){
                    long temp=b;
                    b=a%b;
                    a=temp;
                }
                long ans=((long) nums[i]*nums[j])/(a*a);
                max=Math.max(max,ans);
            }
        }
        return max;

    }
}