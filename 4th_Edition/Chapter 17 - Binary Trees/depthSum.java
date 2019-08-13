//  Write a method depthSum that returns the sum of the values stored in a binary tree of integers weighted by the depth of each value.

public int depthSum() {
    if (overallRoot == null ) {
        return 0;
    }
    Queue<IntTreeNode> q = new LinkedList<>();
    q.add(overallRoot);
    int level = 1;
    int sum = 0;
    while(!q.isEmpty()) {
        int size = q.size();
        while(size-- > 0) {
            IntTreeNode temp = q.remove();
//            System.out.println(temp.data);
            sum += temp.data * level;
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        level++;
    }
    return sum;
//    return depthSum(overallRoot, 1);
}
//
//private int depthSum(IntTreeNode node, int level) {
//    if(node == null)
//        return 0;
//        
//    return level * node.data +
//        depthSum(node.left, level + 1) + depthSum(node.right, level + 1);
//}

public int depthSum() {
    return helper(overallRoot, 0);
}
public int helper(IntTreeNode root, int level) {
    if (root == null)
        return 0;
    else
        return helper(root.left, level + 1) + helper(root.right, level + 1) 
             + (root.data * (level + 1));
}
