class Solution {
    
    public List<Integer> rightSideView(TreeNode root) {
    
        List<Integer> output = new ArrayList<>();
        
        // returning the empty list if the root of the tree is null
        if ( root == null ) {
            return output;
        }
        
        dfs(root, 0, output);
        
        return output;
    }
    
    private void dfs(TreeNode root, int level, List<Integer> output) {

        if (output.size() == level) {
            output.add(root.val);
        } else {
            output.set(level, root.val);
        }
        
        if (root.left != null) {
            dfs(root.left, level + 1, output);
        }
        
        if (root.right != null) {
            dfs(root.right, level + 1, output);
        }
    }
}
