// Last updated: 05/09/2026, 20:05:51
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] s=startTime.split(":");
        String[] e=endTime.split(":");
        int start =           Integer.parseInt(s[0])*3600+Integer.parseInt(s[1])*60+Integer.parseInt(s[2]);
        int end = Integer.parseInt(e[0])*3600+Integer.parseInt(e[1])*60+Integer.parseInt(e[2]);
        return end-start;

        
    }
}