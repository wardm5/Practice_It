public int firstDigit(int val) {
    val = Math.abs(val);
    int res = 0;
    while (val > 0) {
        res = val % 10;
        val /= 10;
    }
    return res;
}
