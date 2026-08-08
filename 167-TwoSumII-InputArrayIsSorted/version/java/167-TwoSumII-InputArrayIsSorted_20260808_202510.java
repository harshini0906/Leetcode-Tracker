// Last updated: 08/08/2026, 20:25:10
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int start = 0;
4        int end = numbers.length - 1;
5        while(start < end){
6            int sum = numbers[start] + numbers[end];
7            if(sum == target){
8                return new int[]{start + 1, end + 1};
9            }
10            else if(sum < target){
11                start++;
12            }
13            else{
14                end--;
15            }
16        }
17        return new int[]{-1, -1};
18    }
19}