public int digitRange(int val) {
    if (val == 0)
        return 1;
    val = Math.abs(val);
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    while (val > 0) {
        if (val % 10 < min)
            min = val % 10;
        if (val % 10 > max) 
            max = val % 10;
        val /= 10;
    }
    return max - min + 1;
}
