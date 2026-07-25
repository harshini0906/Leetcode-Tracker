// Last updated: 25/07/2026, 16:16:07
1class Solution {
2    int dp[][][];
3    public int help(String s, int idx, int t,int prev){
4        if(idx==s.length()) return 1;
5        if(dp[idx][t][prev]!=-1) return dp[idx][t][prev];
6        int res=0;
7        int lb=0, ub=t==1?s.charAt(idx)-'0':1;
8        for(int i=lb; i<=ub; i++){
9            if(i==1 && prev==1){
10                continue;
11            }
12            int nt = t==1 && i==ub?1:0;
13            int nprev = i==1?1:0;
14            res+=help(s,idx+1,nt,nprev);
15        }
16        return dp[idx][t][prev]=res;
17    }
18    public int findIntegers(int n) {
19        dp = new int[30][2][2];
20        for(int i=0; i<dp.length; i++){
21            for(int j=0; j<dp[i].length; j++){
22                Arrays.fill(dp[i][j],-1);
23            }
24        }
25        String str = Integer.toBinaryString(n);
26        int first = str.indexOf('1');
27        String s = str.substring(first);
28        return help(s,0,1,0);
29    }
30}