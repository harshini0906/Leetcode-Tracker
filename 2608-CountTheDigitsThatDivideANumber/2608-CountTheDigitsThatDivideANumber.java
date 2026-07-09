// Last updated: 09/07/2026, 15:06:53
class Solution {
    public int countDigits(int num) {
        int count=0;
        int last, temp=num;
        while(temp!=0) {
            last=temp%10;
            if(num%last==0) count++;
            temp=temp/10;
        }
        return count;
    }
}