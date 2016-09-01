public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        traverse(root,result);
        return result;
    }
    
    private void traverse(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        traverse(root.left,result);
        result.add(root.val);
        traverse(root.right,result);
    }
}
