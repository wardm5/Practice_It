//  Write a method printLeaves that outputs the leaves of a binary tree from right to left.

void printLeaves() {
    if (overallRoot == null) {
        System.out.println("no leaves");
        return;
    }
    Stack<IntTreeNode> s = new Stack<>();
    s.add(overallRoot);
    System.out.print("leaves: ");
    while(!s.isEmpty()) {
        IntTreeNode temp = s.pop();
        if (temp.left == null && temp.right == null) {
            System.out.print(temp.data + " ");
        }
        if (temp.left != null ){
            s.add(temp.left);
        }
        if (temp.right != null) {
            s.add(temp.right);
        }
    }
//    if (overallRoot == null) {
//        System.out.println("no leaves");
//    } else {
//        System.out.print("leaves: ");
//        printLeaves(overallRoot);
//    }
}

//void printLeaves(IntTreeNode root) {
//    if (root == null) {
//        return;
//    } else if (root.left == null && root.right == null) {
//        System.out.print(root.data + " ");
//    } 
//    
//    printLeaves(root.right);
//    printLeaves(root.left);
//}

public void printLeaves() {
    if (overallRoot == null) {
        System.out.println("no leaves");
        return;
    }
    System.out.print("leaves: ");
    helper(overallRoot);
}
public void helper(IntTreeNode root) {
    if (root == null)
        return;
    if (root.right == null && root.left == null)
        System.out.print(root.data + " ");
    helper(root.right);
    helper(root.left);
}
