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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();

        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return res;
        queue.add(root);

        while(!queue.isEmpty())
        {
            List<Integer> lev=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=queue.poll();
                lev.add(temp.val);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);                           
            }
            res.add(lev);
        }
        return res;

        
    }
}