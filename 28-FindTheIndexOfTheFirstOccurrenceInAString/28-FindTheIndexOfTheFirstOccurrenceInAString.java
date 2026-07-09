// Last updated: 09/07/2026, 15:13:40
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0,j=needle.length();j<=haystack.length();i++,j++) {
            if(haystack.substring(i,j).equals(needle)) return i;
        }
        return -1;
    }
}