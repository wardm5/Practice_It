public int gcd(int a, int b) {
    if (a == 0 || b == 0)
        return Math.max(a, b);
    return gcd(Math.abs(b), Math.abs(a) % Math.abs(b));
}
