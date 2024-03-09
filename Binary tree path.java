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
        List<String> ans= new ArrayList<>();
        f(root,ans,"");
        return ans;
    }
    public void f(TreeNode root, List<String>ans, String s){
        if(root==null){
            return;
        }
        if(root.left == null && root.right ==null){
            s+=String.valueOf(root.val);
            ans.add(s);
            return;
        }
     
        f(root.left, ans, s+String.valueOf(root.val)+"->");
                f(root.right, ans, s+String.valueOf(root.val)+"->");

    }
}
