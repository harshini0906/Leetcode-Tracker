// Last updated: 21/08/2026, 20:11:41
1class Solution {
2    public long findKthSmallest(int[] coins, int k) {
3        Arrays.sort(coins);
4        List<Long> usefulList = new ArrayList<>();
5        for (int coin : coins) {
6            boolean redundant = false;
7            for (long prev : usefulList) {
8                if (coin % prev == 0) {
9                    redundant = true;
10                    break;
11                }
12            }
13            if (!redundant) {
14                usefulList.add((long) coin);
15            }
16        }
17        int m = usefulList.size();
18        long[] useful = new long[m];
19        for (int i = 0; i < m; i++) {
20            useful[i] = usefulList.get(i);
21        }
22        long low = 1;
23        long high = useful[0] * k;
24        int totalMasks = 1 << m;
25        long[] lcms = new long[totalMasks];
26        int[] signs = new int[totalMasks];
27        for (int mask = 1; mask < totalMasks; mask++) {
28            long currentLCM = 1;
29            int bits = 0;
30            for (int i = 0; i < m; i++) {
31                if ((mask & (1 << i)) != 0) {
32                    long g = gcd(currentLCM, useful[i]);
33                    currentLCM /= g;
34                    if (currentLCM > high / useful[i]) {
35                        currentLCM = high + 1;
36                        break;
37                    }
38                    currentLCM *= useful[i];
39                    bits++;
40                }
41            }
42            lcms[mask] = currentLCM;
43            signs[mask] = (bits % 2 == 1) ? 1 : -1;
44        }
45        while (low < high) {
46            long mid = low + (high - low) / 2;
47            long count = 0;
48            for (int mask = 1; mask < totalMasks; mask++) {
49                if (lcms[mask] <= mid) {
50                    count += signs[mask] * (mid / lcms[mask]);
51                }
52            }
53            if (count >= k) {
54                high = mid;
55            } else {
56                low = mid + 1;
57            }
58        }
59        return low;
60    }
61    private long gcd(long a, long b) {
62        while (b != 0) {
63            long temp = a % b;
64            a = b;
65            b = temp;
66        }
67        return a;
68    }
69}