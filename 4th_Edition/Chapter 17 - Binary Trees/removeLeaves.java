public void removeLeaves() {
    if (overallRoot == null || overallRoot.left == null && overallRoot.right == null) {
        overallRoot = null;
        return;
    }
    helper(overallRoot);
}

public void helper(IntTreeNode root) {
    if (root == null || root.left == null && root.right == null) {
        root = null;
        return;
    }
    if (root.left != null && root.left.left == null && root.left.right == null)
        root.left = null;
    if (root.right != null && root.right.left == null && root.right.right == null)
        root.right = null;
    
    helper(root.left);
    helper(root.right);
}
