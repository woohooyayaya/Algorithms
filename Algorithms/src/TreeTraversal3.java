public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        LinkedList<TreeNode> stack=new LinkedList<>();
        while(!stack.isEmpty()||root!=null){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }
            else{
                root=stack.pop();
                result.add(root.val);
                root=root.right;
            }
        }
        return result;
    }
}
