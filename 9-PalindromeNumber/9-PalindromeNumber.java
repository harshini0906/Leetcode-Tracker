// Last updated: 09/07/2026, 15:13:59
class Solution {
    public boolean isPalindrome(int x) {
        int original =x;
        int last,sum=0;
        while(x!=0) {
            last=x%10;
            sum=sum*10+last;
            x=x/10;
        }
        if(original==sum && original>=0) return true;
        else return false;
    }
}