// Last updated: 21/08/2026, 20:12:59
1class Solution {
2    public int maxPoints(int[][] points) {
3        if(points.length<=2)
4            return points.length; 
5        int max = 0; 
6        for(int i = 0; i<points.length; i++){
7            HashMap<Double, Integer> mp = new HashMap<>(); 
8            for(int j = i+1; j<points.length; j++){
9                int x1 = points[i][0]; 
10                int x2 = points[j][0]; 
11                int y1 = points[i][1]; 
12                int y2 = points[j][1]; 
13                double slope; 
14                if(x1 == x2)
15                    slope = Double.POSITIVE_INFINITY;
16                else{
17                    slope = (double)(y1-y2)/(x2-x1);
18                    if(slope == -0.0)
19                        slope = 0.0; 
20                } 
21                mp.put(slope, mp.getOrDefault(slope, 0) + 1); 
22            }
23            for(int value: mp.values())
24                max = Math.max(max, value+1); 
25        }
26        return max; 
27    }
28}