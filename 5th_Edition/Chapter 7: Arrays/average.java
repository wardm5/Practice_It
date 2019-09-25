public double average(int[] arr) {
    int count = 0, amount = 0;
    for (int i = 0; i < arr.length; i++) {
        count++;
        amount+= arr[i];
    }
    return (double) amount/count;
}
