// Last updated: 09/07/2026, 15:08:08
class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        int cmax=Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--) {
            if(cmax<arr[i]) cmax=arr[i];
            arr[i]=max;
            max=cmax;
        }
        return arr;
    }
}