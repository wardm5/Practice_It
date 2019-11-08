public int minGap(int[] arr) {
    if (arr.length <= 1) 
        return 0;
    int min = Integer.MAX_VALUE;
    for (int i = 1 ; i < arr.length; i++) {
        if (arr[i] - arr[i-1] < min)
            min = arr[i] - arr[i-1];
    }
    return min;
}
