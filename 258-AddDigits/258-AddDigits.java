// Last updated: 09/07/2026, 15:10:34
class Solution {
    public int addDigits(int num) {
        while(num>=10) {
            int last,sum=0;
            while(num!=0) {
                last=num%10;
                sum=sum+last;
                num=num/10;
            }
            num=sum;
        }
        return(num);
        
        
    }
}