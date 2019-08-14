public void doublePositives() {
    helper(overallRoot);
}
public void helper(IntTreeNode root) {
    if (root == null)
        return;
    else if (root.data >= 0)
        root.data *= 2;
    helper(root.left);
    helper(root.right);
}
