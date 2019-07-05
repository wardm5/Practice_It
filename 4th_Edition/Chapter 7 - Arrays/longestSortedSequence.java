//  Method determines the longest sorted sequence in an int array. O(n) run-time.

int longestSortedSequence(int[] arr) {
    int maxResult = 1; 
    int temp = 1;
    if (arr.length == 0) {
        return 0;   
    } else if ( arr.length == 1) {
        return 1;
    }
    for ( int i = 1; i < arr.length; i ++ ) {
        if (arr[i] >= arr[i-1]) {
            temp++;
            if (temp > maxResult ) {
                maxResult = temp;
            }
        } else {
            temp = 1;
        }
    }
    return maxResult;
}
