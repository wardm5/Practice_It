public int zeroDigits(int n) {
    if (n == 0)
        return 1;
    int count = 0;
    while (n > 0) {
        if (n % 10 == 0)
            count++;
        n /= 10;
    }
    return count;
}
