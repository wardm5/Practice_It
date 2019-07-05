//  Method determines the percent of even numbers in an int array. O(n) run-time.

double percentEven(int[] arr) {
    if ( arr.length == 0) {
        return 0.0;
    }
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            count++;
        }
    }
    return ((double) count / (double) arr.length) * 100.0;
}
