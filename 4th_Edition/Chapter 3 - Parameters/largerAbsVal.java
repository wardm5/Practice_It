//  Write a method called largerAbsVal that takes two integers as parameters and returns the larger of the two absolute values.

public int largerAbsVal(int a, int b) {
    int A = Math.abs(a);
    int B = Math.abs(b);
    if (A > B)
        return A;
    else
        return B;
}
