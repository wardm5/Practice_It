public int digitRange(int n) { 
    if (n == 0)
        return 1;
    n = Math.abs(n);
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    while (n > 0) {
        if (n % 10 < min)
            min = n % 10;
        if (n % 10 > max)
            max = n % 10;
        n /= 10;        
    }
    return (max - min) + 1;
}
