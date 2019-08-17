public boolean consecutive(int a, int b, int c) {
    return (Math.abs(a - b) < 3 && Math.abs(a-c) < 3 && a != b && a != c && b != c);
}
