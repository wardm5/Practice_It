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

public int size() {
    if (overallRoot == null)
        return 0;
    else
        return helper(overallRoot);
}
public int helper(IntTreeNode root) {
    int count = 1;
    Queue<IntTreeNode> q = new LinkedList<>();
    q.add(root);
//    System.out.print(root.data + " ");
    while (!q.isEmpty()) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            IntTreeNode temp = q.remove();
            if (temp.left != null) {
//                System.out.print(temp.left.data + " ");
                q.add(temp.left);
                count++;
            }
            if (temp.right != null) {
//                System.out.print(temp.right.data + " ");
                q.add(temp.right);
                count++;
            }
        }
        size = q.size();
    }
    return count;
}
