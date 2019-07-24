//  Write a method set that accepts an index and a value and sets the list's element at that index to have the 
//  given value. You may assume that the index is between 0 (inclusive) and the size of the list (exclusive).

void set(int index, int val) {
    ListNode current = front;
    int count = 0; 
    while (current != null) {
        if (count == index) {
            current.data = val;
            return;
        }
        count++;
        current = current.next;
    }
}
