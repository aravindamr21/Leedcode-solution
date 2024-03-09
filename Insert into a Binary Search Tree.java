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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val, null , null);
        TreeNode temp=root;
        if(temp==null){
            return newNode;
        
        }
        while(temp!=null){
            if(temp.val<val){
                if(temp.right==null){
                    temp.right=newNode;
                    break;
                }else{
                    temp=temp.right;
                }
            }else{
                if(temp.left==null){
                    temp.left=newNode;
                    break;
                }else{
                    temp=temp.left;
                }
            }
        }return root;
    }
}
