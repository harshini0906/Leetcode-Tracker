// Last updated: 09/07/2026, 15:07:50
class Solution {
    public int subtractProductAndSum(int n) {
        int last,sum=0,prod=1;
        while(n!=0) {
            last=n%10;
            sum=sum+last;
            prod=prod*last;
            n=n/10;
        }
        return prod-sum;
    }
}