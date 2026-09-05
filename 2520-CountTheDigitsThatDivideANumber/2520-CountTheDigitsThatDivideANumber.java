// Last updated: 05/09/2026, 20:09:29
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