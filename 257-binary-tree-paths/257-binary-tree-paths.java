/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        helper(list, root, path);
        return list;
    }
    
    private void helper(List<String> list, TreeNode root, StringBuilder path) {
        if(root == null) {
            return;
        }
        int len = path.length();
        path.append(root.val);
        if(root.left == null && root.right == null) {
            list.add(path.toString());
        } else {
            path.append("->");
            helper(list, root.left, path);
            helper(list, root.right, path);
        }
        path.setLength(len);
    }
}