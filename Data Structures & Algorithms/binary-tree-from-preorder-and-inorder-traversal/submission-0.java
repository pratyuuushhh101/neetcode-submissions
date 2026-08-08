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
    HashMap<Integer, Integer> map;
    public int preind;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            map.put(inorder[i],i);
        
        preind=0;
        return build(preorder,0,inorder.length-1);
    }

    public TreeNode build(int preorder[], int inst, int inend)
    {
        if(inst>inend) return null;

        int rootval= preorder[preind];
        preind++;

        TreeNode root=new TreeNode(rootval);

        int mid=map.get(rootval);

        root.left=build(preorder,inst,mid-1);
        root.right=build(preorder, mid+1,inend);

        return root;
    }
}
