// Method to determine if a double array is sorted or not. O(n) worst case run-time.

public static boolean isSorted(double[] arr) {
    double prev = Double.MIN_VALUE;
    for ( int i = 0; i < arr.length; i++ ) {  //  O(n) worst case
        if (prev < arr[i]) {
            prev = arr[i];
        } else {
            return false;
        }
    }
    return true;
}
