// Last updated: 09/07/2026, 15:08:41
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> s = new Stack();
        int[] ans = new int[n];
        for(int cday=0; cday<n; cday++) {
            while(!s.empty() && temperatures[cday] > temperatures[s.peek()]) {
                ans[s.peek()] = cday - s.peek();
                s.pop();
            }
            s.push(cday);
        }
        return ans;
    }
}