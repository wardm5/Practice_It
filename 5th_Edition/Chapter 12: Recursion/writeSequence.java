public void writeSequence(int n) {
    if (n < 1)
        throw new IllegalArgumentException();
    else if (n == 1)
        System.out.print(1);
    else if (n == 2)
        System.out.print("1 1");
    else if (n % 2 ==0 ) {
        System.out.print((n/2) + " ");
        writeSequence(n-2);
        System.out.print(" " + (n/2));
    } else {
        System.out.print((n/2+1) + " ");
        writeSequence(n-2);
        System.out.print(" " + (n/2+1));
    }
}
