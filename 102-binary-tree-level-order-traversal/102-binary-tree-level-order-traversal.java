public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        
        if(root == null) return list;
        
        q.add(root);
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<level; i++) {
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                subList.add(q.remove().val);
            }
            list.add(subList);
        }
        return list;
    }
}