// Last updated: 05/09/2026, 20:06:33
class Solution {
    public String largestEven(String s) {
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i)%2==0) return s.substring(0,i+1);
        }
        return "";
    }
}