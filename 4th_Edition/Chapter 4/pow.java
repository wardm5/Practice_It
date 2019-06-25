//  Write a method named pow that accepts a base and an exponent as parameters and returns the base raised to the given power.

public int pow(int a, int b) {
    int sum = 1;
    for (int i = 1; i<= b; i++) {
        sum *= a;
    }
    return sum;
}
