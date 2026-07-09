// Last updated: 09/07/2026, 15:14:02
class Solution {
    public int reverse(int x) {
        long last,sum=0;
        while(x!=0) {
            last=x%10;
            sum=sum*10+last;
            x=x/10;
        }
        if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE) return 0;
        return (int)sum;
    }
}