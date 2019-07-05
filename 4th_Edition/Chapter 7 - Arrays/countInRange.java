// Method takes in int array, min and max and determines how many numbers fall between the min and max values in the array.
// O(n) run-time.

int countInRange (int[] arr, int min, int max) {
    int count = 0;
    for (int i = 0; i <arr.length; i ++ ) {
        if (arr[i] >= min && arr[i] <= max) {
            count++;
        }
    }
    return count;
}
