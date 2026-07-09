// Last updated: 09/07/2026, 15:06:09
class Solution {
    public String reversePrefix(String s, int k) {
        String rev=new StringBuilder(s).reverse().toString();
        if(k>s.length()) return rev;
        char[] ch=s.toCharArray();
        int l=0, r=k-1;
        while(l<r) {
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        return new String(ch);
    }
}