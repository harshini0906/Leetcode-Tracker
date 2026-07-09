// Last updated: 09/07/2026, 15:06:24
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int last,sum=0;
        while(temp!=0) {
            last=temp%10;
            sum=sum+last;
            temp=temp/10;
        }
        if(x%sum==0) return sum;
        else return -1;

    }
}