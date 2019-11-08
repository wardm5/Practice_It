public int kthLargest(int k, int[] arr) {
    // O(n) solution
    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < arr.length; i++) {
        set.add(arr[i]);
    }
    int i = 0;
    for (int temp : set) {
        if (i == arr.length - k - 1)
            return temp;
        i++;
    }
    return -1;
//    O(nlog(n)) solution
//    Arrays.sort(arr);
//    return arr[arr.length - k - 1];
    
}
