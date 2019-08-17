public int firstDigit(int val) {
    val = Math.abs(val);
    while (val >= 10) {
        val /= 10;
    }
    return val;
}
