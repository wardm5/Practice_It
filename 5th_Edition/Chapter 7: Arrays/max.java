public int max(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max)
            max = arr[i];
    }
    return max;
}
