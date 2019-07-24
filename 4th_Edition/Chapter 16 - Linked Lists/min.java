//  Write a method min that returns the minimum value in a list of integers. If the list is empty, it should 
//  throw a NoSuchElementException.

public int min() {
    ListNode curr = front;
    if (curr == null)
        throw new NoSuchElementException();
    int min = Integer.MAX_VALUE;
    while (current != null) {
        if (min > current.data)
            min = current.data;
        current = current.next;
    }
    return min;
}
