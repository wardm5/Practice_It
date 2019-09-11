public void reverse() {
    if(front == null)
        return;
    ListNode prev = null;
    ListNode curr = front;
    ListNode next = null;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    front = prev;
}
