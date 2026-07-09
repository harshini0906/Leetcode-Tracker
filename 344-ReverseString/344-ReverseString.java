// Last updated: 09/07/2026, 15:10:12
class Solution {
    public void reverseString(char[] s) {
        int st=0;
        int e=s.length-1;
        while(st<=e) {
            char temp=s[st];
            s[st]=s[e];
            s[e]=temp;
            st++;
            e--;
        }
    }
}