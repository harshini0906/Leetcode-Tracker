// Last updated: 13/08/2026, 15:50:43
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public void flatten(TreeNode root) {
18        TreeNode current = root;
19        while (current != null) {
20            if (current.left != null) {
21                TreeNode temp = current.left;
22                while (temp.right != null) {
23                    temp = temp.right;
24                }
25                temp.right = current.right;
26                current.right = current.left;
27                current.left = null;
28            }
29            current = current.right;
30        }
31    }
32}