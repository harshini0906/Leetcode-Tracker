// Last updated: 16/10/2026, 16:12:03
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public boolean isPalindrome(ListNode head) {
13        ListNode slow=head;
14        ListNode fast=head;
15        while(fast!=null && fast.next!=null) {
16            slow=slow.next;
17            fast=fast.next.next;
18        }
19        ListNode prev=null;
20        while(slow!=null) {
21            ListNode next=slow.next;
22            slow.next=prev;
23            prev=slow;
24            slow=next;
25        }
26        while(prev!=null && head!=null) {
27            if(prev.val!=head.val) return false;
28            prev=prev.next;
29            head=head.next;
30        }
31        return true;
32    }
33}