// Time Complexity: O(n), Space Complexity: O(1)

public int lastIndexOf(int[] arr, int a) {
    for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] == a)
            return i;
    }
    return -1;
}
