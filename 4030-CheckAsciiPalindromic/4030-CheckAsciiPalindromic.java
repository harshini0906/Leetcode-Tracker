// Last updated: 05/09/2026, 20:05:25
class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder str=new StringBuilder();
        for (char c:s.toCharArray()) {
            String bin=String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
            str.append(bin);
        }
        int l=0;
        int r=str.length()-1;
        while(l<r) {
            if(str.charAt(l)!=str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}