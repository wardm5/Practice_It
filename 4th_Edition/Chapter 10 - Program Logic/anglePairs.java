public boolean anglePairs(int a, int b, int c) {
    if (a + b == 90 || a + c == 90 || b + c == 90)
        return true;
    if (a + b == 180 || a + c == 180 || b + c == 180)
        return true;
    return false;
}
