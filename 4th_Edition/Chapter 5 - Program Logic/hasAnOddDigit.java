public boolean hasAnOddDigit(int n) {
    if (n == 0)
        return false;
    else if (n % 2 != 0) 
        return true;
    else 
        return hasAnOddDigit(n/10);    
}
