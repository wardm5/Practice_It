// Method takes in an array and finds the Kth largest value. O(n log(n) ) run time due to the Arrays.sort() doing probably a merge sort.

int kthLargest(int k, int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length - 1 - k];
}
