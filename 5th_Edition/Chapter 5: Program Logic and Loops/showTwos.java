public void showTwos(int n) {
    int neg = 1;
    if (n < 0) {
        n *= -1;
        neg = -1;
    }
    System.out.print((n * neg) + " = ");
    while (n > 0 && n % 2 == 0) {
        System.out.print("2 * ");
        n /= 2;
    }
    System.out.println(n * neg);
}
