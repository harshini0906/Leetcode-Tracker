// Last updated: 01/10/2026, 15:07:40
1class Solution {
2    public int romanToInt(String s) {
3        int n=s.length();
4        int ans=convert(s.charAt(n-1));
5        for(int i=n-2; i>=0; i--) {
6            int a=convert(s.charAt(i));
7            int b=convert(s.charAt(i+1));
8            if(a<b) ans=ans-a;
9            else ans=ans+a;
10        }
11        return ans;
12    }
13    public int convert(char ch) {
14        switch(ch) {
15            case 'I': return 1;
16            case 'V': return 5;
17            case 'X': return 10;
18            case 'L': return 50;
19            case 'C': return 100;
20            case 'D': return 500;
21            case 'M': return 1000;
22            default: return 0;
23        }
24    }
25}