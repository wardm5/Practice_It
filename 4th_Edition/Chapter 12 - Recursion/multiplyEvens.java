//  Write a method multiplyEvens that returns the product of the first n even integers. 

public int multiplyEvens(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    } else if (n == 1) {
        return 2;
    } else {
        return 2 * n * multiplyEvens(n - 1);
    }
}
