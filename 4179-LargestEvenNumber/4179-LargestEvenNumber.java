// Last updated: 09/07/2026, 15:06:04
class Solution {
    public String largestEven(String s) {
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i)%2==0) return s.substring(0,i+1);
        }
        return "";
    }
}