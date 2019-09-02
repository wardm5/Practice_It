public void tighten() {
    overallRoot = helper(overallRoot);
}
public IntTreeNode helper(IntTreeNode root) {
    if (root == null) 
        return null;
    if (root.left == null && root.right == null)
        return root;
    root.left = helper(root.left);
    root.right = helper(root.right);
    if (root.left != null && root.right != null)
        return root;
    else if (root.left == null && root.right != null)
        return root.right;
    else if (root.left != null && root.right == null)
        return root.left;
    return null;
}
