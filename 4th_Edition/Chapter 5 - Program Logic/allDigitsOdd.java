public boolean allDigitsOdd(int n) {
    if (n == 0) 
        return false;
    else if (n < 10 && n % 2 != 0)
        return true;
    else if (n % 2 != 0)
        return allDigitsOdd(n/10);
    return false;
}
