public int size() {
    if (overallRoot == null)
        return 0;
    else 
        return helper(overallRoot.left) + helper(overallRoot.right) + 1;
}
public int helper(IntTreeNode root) {
    if (root == null)
        return 0;
    else 
        return helper(root.left) + helper(root.right) + 1;
}
