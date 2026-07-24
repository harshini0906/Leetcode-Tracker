// Last updated: 24/07/2026, 18:59:17
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head==null||head.next==null||k==0) return head; 
14        int len=1;
15        ListNode tail=head;
16        while(tail.next!=null){ tail=tail.next; len++; } 
17        k%=len;
18        if(k==0) return head; 
19        tail.next=head; 
20        int steps=len-k;
21        ListNode newtail=head;
22        for(int i=1;i<steps;i++) newtail=newtail.next; 
23        ListNode newhead=newtail.next; 
24        newtail.next=null;
25        return newhead;
26    }
27}