// Last updated: 05/09/2026, 20:05:53
class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] res=new char[s.length()];
        int l=0;
        int r=s.length()-1;
        for(char ch:s.toCharArray()) {
            if(ch==y) res[l++]=y;
            else if(ch==x) res[r--]=x;
        }
        for(char ch:s.toCharArray()) {
            if(ch!=x && ch!=y) res[l++]=ch;
        }
        return new String(res);
    }
}