// Method finds the minimum gap between any values in a passed in int array. O(n) run-time. 

int minGap (int[] arr) {
    if (arr.length <= 1) {
        return 0;
    }
    int min = Integer.MAX_VALUE;
    for ( int i = 1; i < arr.length; i++ ) {
        int temp = arr[i] - arr[i - 1];
        if ( temp < min) {
            min = temp;
        }
    }
    return min;
}
