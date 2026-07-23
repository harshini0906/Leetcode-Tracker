// Last updated: 23/07/2026, 20:21:02
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
17    int index = 0; 
18    public TreeNode buildTree(int[] preorder, int[] inorder) {
19        HashMap<Integer, Integer> map = new HashMap<>();
20        for (int i = 0; i < inorder.length; i++) {
21            map.put(inorder[i], i); 
22        }
23        return helper(preorder, 0, inorder.length - 1, map);
24    }
25    private TreeNode helper(int[] preorder, int start, int end, HashMap<Integer, Integer> map) {
26        if (start > end) return null;
27        int rootVal = preorder[index++];
28        TreeNode node = new TreeNode(rootVal);
29        int inorderIndex = map.get(rootVal);
30        node.left = helper(preorder, start, inorderIndex - 1, map);
31        node.right = helper(preorder, inorderIndex + 1, end, map);
32        return node;
33    }
34}