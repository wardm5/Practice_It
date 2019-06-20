//  Method appends one int array with another int array. O(n) run-time.

public int[] append(int[] list1, int[] list2) {
    int size = list1.length + list2.length;
    int[] arr = new int[size];
    for (int i = 0; i < list1.length; i++) {
        arr[i] = list1[i];
    }
    for (int i = 0; i < list2.length; i++) {
        arr[i + list1.length] = list2[i];
    }
    return arr;
}
