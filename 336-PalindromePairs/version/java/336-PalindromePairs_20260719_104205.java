// Last updated: 19/07/2026, 10:42:05
1class Solution {
2    public List<List<Integer>> palindromePairs(String[] words) {
3        HashMap<String,Integer> wordMap = new HashMap<>();
4        Set<Integer> set = new TreeSet<>();
5        int n = words.length;
6        for(int i=0;i<n;i++){
7            wordMap.put(words[i],i);
8            set.add(words[i].length());
9        } 
10        List<List<Integer>> ans = new ArrayList<>();
11        for(int i=0;i<n;i++){
12            int length = words[i].length();
13            String reverse= new StringBuilder(words[i]).reverse().toString();
14            if(wordMap.containsKey(reverse) && wordMap.get(reverse) != i)
15                ans.add(Arrays.asList(i,wordMap.get(reverse)));
16            for(Integer k:set){
17                if(k==length)
18                    break;
19                if(isPalindrome(reverse,0,length-1-k)){
20                    String s1 = reverse.substring(length-k);
21                    if(wordMap.containsKey(s1))
22                        ans.add(Arrays.asList(i,wordMap.get(s1)));
23                }  
24                if(isPalindrome(reverse,k,length-1)){
25                    String s2 = reverse.substring(0,k);
26                    if(wordMap.containsKey(s2))
27                        ans.add(Arrays.asList(wordMap.get(s2),i));
28                }
29            }
30        }
31        return ans;
32    }
33    private boolean isPalindrome(String s, int left, int right){
34        while(left<right)
35            if(s.charAt(left++)!=s.charAt(right--))
36                return false;
37        return true;
38    }
39}