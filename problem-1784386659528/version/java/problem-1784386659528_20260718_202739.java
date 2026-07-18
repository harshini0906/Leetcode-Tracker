// Last updated: 18/07/2026, 20:27:39
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        char[] res=new char[s.length()];
4        int l=0;
5        int r=s.length()-1;
6        for(char ch:s.toCharArray()) {
7            if(ch==y) res[l++]=y;
8            else if(ch==x) res[r--]=x;
9        }
10        for(char ch:s.toCharArray()) {
11            if(ch!=x && ch!=y) res[l++]=ch;
12        }
13        return new String(res);
14    }
15}