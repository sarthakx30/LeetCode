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
    // public TreeNode deleteNode(TreeNode root, int key) {
    //     if(root==null){
    //         return root;
    //     }
    //     if(key<root.val){
    //         root.left=deleteNode(root.left,key);
    //     }
    //     else if(key>root.val){
    //         root.right=deleteNode(root.right,key);
    //     }
    //     else{
    //         if(root.left==null){
    //             return root.right;
    //         }
    //         else if(root.right==null){
    //             return root.left;
    //         }
    //         else{
    //             root.val=minValue(root.right);
    //             root.right=deleteNode(root.right,root.val);
    //         }
    //     }
    //     return root;
    // }
    // private static int minValue(TreeNode root){
    //     while(root.left!=null){
    //         root=root.left;
    //     }
    //     return root.val;
    // }
    
    private TreeNode deleteRootNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null) {
            return root.right;
        }
        if (root.right == null) {
            return root.left;
        }
        
        TreeNode next = findMin(root.right);
        next.left = root.left;
        return root.right;
    }
    
    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode cur = root;
        TreeNode pre = null;
        while(cur != null && cur.val != key) {
            pre = cur;
            if (key < cur.val) {
                cur = cur.left;
            } else if (key > cur.val) {
                cur = cur.right;
            }
        }
        if (pre == null) {
            return deleteRootNode(cur);
        }
        if (pre.left == cur) {
            pre.left = deleteRootNode(cur);
        } else {
            pre.right = deleteRootNode(cur);
        }
        return root;
    }
}