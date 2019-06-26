//  Write a method largestAbsVal that accepts three integers as parameters and returns the largest of their three absolute values.

public int largestAbsVal(int a, int b, int c) {
    int A = Math.abs(a);
    int B = Math.abs(b);
    int C = Math.abs(c);
    if (A >= B && A >= C)
        return A;
    if (B >= A && B >= C)
        return B;
    return C;
}
