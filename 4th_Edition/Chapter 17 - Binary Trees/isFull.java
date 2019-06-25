//  Write a method isFull that returns whether or not a binary tree is full (true, if it is, false if otherwise). 

boolean isFull() {
    if (overallRoot == null ) {
        return true;
    }
    Queue<IntTreeNode> q = new LinkedList<>();
    q.add(overallRoot);
    while(!q.isEmpty()) {
        int size = q.size();
        while (size-- > 0) {
            IntTreeNode temp = q.remove();
            if (temp.right != null && temp.left == null) {
                return false;
            }
            if (temp.right == null && temp.left != null) {
                return false;
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null ) {
                q.add(temp.right);
            }
        }
    }
    return true;
//        return isFull(overallRoot);
}

//boolean isFull(IntTreeNode root) {
//    if (root == null) {
//        return true;
//    }
//    if (root.left == null && root.right != null)  {
//        return false;
//    }
//        
//    if (root.left != null && root.right == null ) {
//        return false;
//    }
//    return isFull(root.right) && isFull(root.left) ;
//}
