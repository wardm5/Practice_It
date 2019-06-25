//  Write a method countLeftNodes that returns the number of left children in the tree. 

public int countLeftNodes() {
    if (overallRoot == null)
        return 0;
    int count = 0;
    Queue<IntTreeNode> q = new LinkedList<>();
    q.add(overallRoot);
    while(!q.isEmpty()) {
        IntTreeNode temp = q.remove();
        if (temp.left != null) {
            count++;
            q.add(temp.left);
        }
        if (temp.right != null) {
            q.add(temp.right);
        }
    }
    return count;
}
