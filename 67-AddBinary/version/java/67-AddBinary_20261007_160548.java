// Last updated: 07/10/2026, 16:05:48
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder res=new StringBuilder();
4        int i=a.length()-1;
5        int j=b.length()-1;
6        int carry=0;
7        while(i>=0 || j>=0) {
8            int sum=carry;
9            if(i>=0) sum+=a.charAt(i--)-'0';
10            if(j>=0) sum+=b.charAt(j--)-'0';
11            carry=sum>1?1:0;
12            res.append(sum%2);
13        }
14        if(carry!=0) res.append(carry);
15        return res.reverse().toString();
16    }
17}