// Last updated: 07/10/2026, 16:06:12
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode temp=head;
14        while(temp!=null && temp.next!=null) {
15            if(temp.val==temp.next.val) temp.next=temp.next.next;
16            else temp=temp.next;
17        }
18        return head;
19    }
20}