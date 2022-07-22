class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> lst = new ArrayList<>();
        
        traverse(root, lst);
        
        return lst;
        
    }
    public void traverse(TreeNode root, List<Integer> lst){
        
        if(root!=null){
            traverse(root.left,lst);
            traverse(root.right,lst);
            lst.add(root.val);
        
    }
        
    }
    
    
}

// Post Order Traversal : Left, Right, Root