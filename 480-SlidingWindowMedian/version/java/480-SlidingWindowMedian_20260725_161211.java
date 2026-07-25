// Last updated: 25/07/2026, 16:12:11
1public class Solution {
2    public double[] medianSlidingWindow(int[] nums, int k) {
3        List<Double> resList = new ArrayList<>();
4        int n = nums.length;
5        int i = 0;
6        int j = k - 1;
7        List<Integer> temp = new ArrayList<>();
8        for (int x = 0; x < k - 1; x++) {
9            temp.add(nums[x]);
10        }
11        Collections.sort(temp);
12        while (j < n) {
13            int num = nums[j];
14            int insertIdx = Collections.binarySearch(temp, num);
15            if (insertIdx < 0) {
16                insertIdx = -insertIdx - 1;
17            }
18            temp.add(insertIdx, num);
19            if (k % 2 == 1) {
20                double median = (double) temp.get(k / 2);
21                resList.add(median);
22            } else {
23                int idx = k / 2;
24                double median1 = (double) temp.get(idx);
25                double median2 = (double) temp.get(idx - 1);
26                resList.add((median1 + median2) / 2);
27            }
28            int removeIdx = Collections.binarySearch(temp, nums[i]);
29            if (removeIdx < 0) {
30                removeIdx = -removeIdx - 1;
31            }
32            temp.remove(removeIdx);
33            i++;
34            j++;
35        }
36        double[] resArray = new double[resList.size()];
37        for (int x = 0; x < resList.size(); x++) {
38            resArray[x] = resList.get(x);
39        }
40        return resArray;
41    }
42}