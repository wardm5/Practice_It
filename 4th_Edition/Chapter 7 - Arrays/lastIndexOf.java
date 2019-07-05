// Method that gets gets the last index of a target value in an array. O(n) run-time.

public int lastIndexOf(int[] arr, int val) {
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == val) {
            index = i;
        }
    }
    return index;
}
