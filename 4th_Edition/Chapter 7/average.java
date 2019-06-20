double average(int[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum+= arr[i];
    }
    return (double) (sum / arr.length);
}
