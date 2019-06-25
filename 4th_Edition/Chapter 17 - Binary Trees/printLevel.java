//  Write a method printLevel that accepts an integer parameter n and that prints the values at level n from the left to right, one per line. 

void printLevel(int target) {
    if (target < 1)  {
        throw new IllegalArgumentException();
    } else if (overallRoot == null) {
        return;
    }
    Queue<IntTreeNode> q = new LinkedList<>();
    int level = 1;
    q.add(overallRoot);
    while(!q.isEmpty()) {
        int size = q.size();
        while (size-- > 0) {
            IntTreeNode temp = q.remove();
            if (level == target) {
                System.out.println(temp.data);
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        level++;
    }
//    if (target < 1) {
//        throw new IllegalArgumentException();
//    } else if (overallRoot == null) {
//        return;
//    } else {
//        return printLevel(overallRoot , n,  1);
//    }
}

//void printLevel(IntTreeNode root, int target, int level) {
//    if (root == null) {
//        return;
//    } else if (level == target) {
//        System.out.print(root.data + " ");
//    } 
//    printLevel(root.left, target, level + 1);
//    printLevel(root.right, target, level+1);
//}
