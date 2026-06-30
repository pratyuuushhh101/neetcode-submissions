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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {  
        depth(root); 
        return dia;      
    }

    public int depth(TreeNode node)
    {
        if(node==null) return 0;
        int left=depth(node.left);
        int right=depth(node.right);
        dia=Math.max(dia,(left+right));
        return 1+ Math.max(left,right);       


    }
}