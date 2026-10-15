// Last updated: 15/10/2026, 11:01:44
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow=head;
15        ListNode fast=head;
16        boolean isCycle=false;
17        while(fast!=null && fast.next!=null) {
18            slow=slow.next;
19            fast=fast.next.next;
20            if(slow==fast) {
21                isCycle=true;
22                break;
23            }
24        }
25        if(!isCycle) return null;
26        while(head!=slow) {
27            head=head.next;
28            slow=slow.next;
29        }
30        return head;
31    }
32}