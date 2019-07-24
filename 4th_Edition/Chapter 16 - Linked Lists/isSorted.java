//  Write a method isSorted that returns true if the list is in sorted (nondecreasing) order and returns false otherwise. 
//  An empty list is considered to be sorted.


boolean isSorted() {
    if (front == null)
        return true;
    int prev = Integer.MIN_VALUE;
    ListNode curr = front;
    while (curr != null) {
        if (curr.data < prev)
            return false;
        prev = curr.data;
        curr = curr.next;
    }
    return true;
}
