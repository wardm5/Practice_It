// Method takes an int array and finds the median value. O(n log(n) ) runtime due to Arrays.sort() doing a merge sort.

int median(int[] array) {
    Arrays.sort(array);
    return array[array.length / 2];
}
