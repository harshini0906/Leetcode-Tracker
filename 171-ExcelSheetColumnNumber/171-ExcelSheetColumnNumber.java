// Last updated: 09/07/2026, 15:11:37
class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for(int i=0; i<columnTitle.length(); i++) {
            res=(res*26)+(columnTitle.charAt(i)-'A'+1);
        }
        return res;
    }
}