// Last updated: 09/07/2026, 15:13:10
class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> num=new LinkedList<Integer>();
        for(int i=1; i<=n; i++) num.add(i);
        int[] fact=new int[n];
        fact[0]=1;
        for(int i=1; i<n; i++) fact[i]=i*fact[i-1];
        k=k-1;
        StringBuilder sb=new StringBuilder();
        for(int i=n; i>0; i--) {
            int idx=k/fact[i-1];
            k=k%fact[i-1];
            sb.append(num.get(idx));
            num.remove(idx);
        }
        return sb.toString();
    }
}