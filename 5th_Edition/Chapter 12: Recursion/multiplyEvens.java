public int multiplyEvens(int n) {
    if (n < 1) 
        throw new IllegalArgumentException();
    if (n == 1)
        return 2;
    else 
        return multiplyEvens(n-1) * (2 * n);
}
