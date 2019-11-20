public int digitSum(int val) {
    val = Math.abs(val);
    int sum = 0;
    while (val > 0) {
        sum += val % 10;
        val /= 10;
    }
    return sum;
}
