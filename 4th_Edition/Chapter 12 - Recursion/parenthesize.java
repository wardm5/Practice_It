public void parenthesize(String str, int n) {
    if (n < 0) 
        throw new IllegalArgumentException();
    if (n == 0) {
        System.out.print(str);
        return;
    }
    System.out.print("(");
    parenthesize(str, n-1);
    System.out.print(")");
}
