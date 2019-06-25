//  Write a method countEmpty that returns the number of empty branches in a tree.

int countEmpty() {
    if (overallRoot == null) {
        return 1;
    }
    int count = 0;
    Queue<IntTreeNode> q = new LinkedList<>();
    q.add(overallRoot);
    while(!q.isEmpty()) {
        IntTreeNode temp = q.remove();
        if (temp.left != null) {
            q.add(temp.left);
        } else {
            count++;
        }
        if (temp.right != null) {
            q.add(temp.right);
        } else {
            count++;
        }
    }
    return count;
//    return countEmpty(overallRoot);
}

//private int countEmpty(IntTreeNode node) {
//    if(node == null) {
//        return 1;
//    }
//    return countEmpty(node.left) + countEmpty(node.right);
//}
