//  Write a method called fractionSum that accepts an integer parameter n and returns as a double the sum of the first n terms of the sequence.

public double fractionSum(int n) {
    double sum = 0.0;
    for (int i = 0; i < n; i++) {
        sum +=  (double) 1 / (i + 1);
    }
    return sum;
}
