public int digitSum(int val) {
    int sum = 0;
    val = Math.abs(val);
    while (val > 0) {
        int temp = val % 10;
        sum += temp;
        val /= 10;
    }
    return sum;
}
