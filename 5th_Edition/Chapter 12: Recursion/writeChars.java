public void writeChars(int n) {
    if (n < 1)
        throw new IllegalArgumentException();
    if (n == 1) 
        System.out.print("*");
    else if (n == 2) 
        System.out.print("**");
    else {
        System.out.print("<");
        writeChars(n-2);
        System.out.print(">");
    }
}
