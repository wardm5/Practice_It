//  Write a method numberNodes that changes the data stored in a binary tree, assigning sequential integers starting with 1 to each node so that a pre-order traversal will produce the numbers in order(1, 2, 3, etc.).

int numberNodes() {
    if (overallRoot == null) 
        return 0;
    Stack<IntTreeNode> s = new Stack<>();
    s.add(overallRoot);
    int size = 0;
    int count = 1;
    while (!s.isEmpty()) {
        IntTreeNode temp = s.pop();
        temp.data = count;
        size++;
        if (temp.right != null) {
            s.add(temp.right);
        }
        if (temp.left != null) {
            s.add(temp.left);
        }
        count++;
    }
    return size;
}
