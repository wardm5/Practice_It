//  Two trees are considered equal if they have exactly the same structure and store the same values. Each node in one tree must have a corresponding node in the other tree in the same location relative to the root and storing the same value.

public boolean equals2(IntTree t2) {
//    Queue<IntTreeNode> q1 = new LinkedList<>();
//    Queue<IntTreeNode> q2 = new LinkedList<>();
//    q1.add(overallRoot);
//    q2.add(t2.overallRoot);
//    while(!q1.isEmpty() && !q2.isEmpty()) {
//        IntTreeNode temp1 = q1.remove();
//        IntTreeNode temp2 = q2.remove();
//        if (temp1.data != temp2.data) {
//            return false;
//        }
//        if (temp1.left != null && temp2.left != null) {
//            q1.add(temp1.left);
//            q2.add(temp2.left);
//        }
//        if (temp1.right != null && temp2.right != null) {
//            q1.add(temp1.right);
//            q2.add(temp2.right);
//        }
//    }
//    return true;
    return equals2(overallRoot, t2.overallRoot);
}

private boolean equals2(IntTreeNode n1, IntTreeNode n2) {
    if(n1 == null && n2 == null)
        return true;
        
    if(n1 == null && n2 != null)
        return false;
        
    if(n1 != null && n2 == null)
        return false;
        
    return n1.data == n2.data && equals2(n1.left, n2.left) &&
        equals2(n1.right, n2.right);
}
