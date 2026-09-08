// Last updated: 08/09/2026, 09:58:13
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
17    public TreeNode buildTree(int[] inorder, int[] postorder) {
18        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
19    }
20    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
21        if (inStart > inEnd || postStart > postEnd) {
22            return null;
23        }
24        int rootVal = postorder[postEnd];
25        TreeNode root = new TreeNode(rootVal);
26        int rootIndex = 0;
27        for (int i = inStart; i <= inEnd; i++) {
28            if (inorder[i] == rootVal) {
29                rootIndex = i;
30                break;
31            }
32        }
33        int leftSize = rootIndex - inStart;
34        int rightSize = inEnd - rootIndex;
35        root.left = buildTree(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftSize - 1);
36        root.right = buildTree(inorder, rootIndex + 1, inEnd, postorder, postEnd - rightSize, postEnd - 1);
37        return root;
38    }
39}
40