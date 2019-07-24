//  Write a method writeSequence that accepts an integer n as a parameter and 
//  prints a symmetric sequence of n numbers with descending integers ending in 
//  1 followed by ascending integers beginning with 1

public static void writeSequence(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    } else if (n == 1) {
        System.out.print("1");
    } else if (n == 2) {
        System.out.print("1 1");
    } else if ( n > 1) {
        System.out.print((n - (n/2)) + " ");
        writeSequence(n - 2);
        System.out.print(" " + (n - (n/2)));
    }
}
