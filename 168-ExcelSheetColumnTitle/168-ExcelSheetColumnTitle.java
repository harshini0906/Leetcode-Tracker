// Last updated: 09/07/2026, 15:11:42
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb=new StringBuffer();
        while(columnNumber!=0) {
            int d=--columnNumber%26;
            sb.append((char)(d+65));
            columnNumber/=26;
        }
        return (sb.reverse().toString());
    }
}