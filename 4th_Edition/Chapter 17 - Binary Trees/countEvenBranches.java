//  Write a method countEvenBranches that returns the number of branch nodes in a binary tree that contain even numbers.

public int countEvenBranches() {
    if (overallRoot == null ) { 
        return 0;
    }
    int count = 0;
    Queue<IntTreeNode> q = new LinkedList<>();
    q.add(overallRoot);
    while(!q.isEmpty()) {
        IntTreeNode temp = q.remove();
        if (temp.data % 2 == 0 && (temp.left != null || temp.right != null) )
            count++;
        if (temp.left != null) {
            q.add(temp.left);
        }
        if (temp.right != null) {
            q.add(temp.right);
        }
    }
    return count;
//    return countEvenBranches(overallRoot);
}

//int countEvenBranches(IntTreeNode root) {
//    int count = 0;
//    if (root == null) {
//        return 0;
//    } else if (root.data % 2 == 0 && (root.left != null || root.right !=null)) {
//        count++;
//    }
//}
public int countEvenBranches() {
    return helper(overallRoot);
}
public int helper(IntTreeNode root) {
    if (root == null)
        return 0;
    else if (root.data % 2 == 0 && (root.left != null || root.right != null))
        return helper(root.left) + helper(root.right) + 1;
    else 
        return helper(root.left) + helper(root.right);
}
