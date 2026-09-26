// Last updated: 26/09/2026, 20:20:31
1class Solution {
2    public int minQueenMoves(int[] source, int[] target) {
3        if(source[0]==target[0] && source[1]==target[1]) return 0;
4        if(source[0]==target[0] || source[1]==target[1] || Math.abs(source[0]-target[0])==Math.abs(source[1]-target[1])) return 1;
5        return 2;
6    }
7}