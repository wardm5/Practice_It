public double percentEven(int[] arr) {
    if (arr.length == 0)
        return 0.0;
    int evenCount = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0)
            evenCount++;
    }
    return  ((double) evenCount / (double)arr.length) * 100;
}
