public void writeNums(int n) {
    if (n < 1)
        throw new IllegalArgumentException();
    else if (n == 1)
        System.out.print(1);
    else {
        writeNums(n-1);
        System.out.print(", " + n);
    }
}
