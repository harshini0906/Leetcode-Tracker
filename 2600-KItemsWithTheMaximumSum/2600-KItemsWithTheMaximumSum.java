// Last updated: 05/09/2026, 20:09:14
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k<=numOnes) return k;
        else if (k<=(numOnes+numZeros)) return numOnes;
        else return numOnes-(k-(numOnes+numZeros));
    }
}