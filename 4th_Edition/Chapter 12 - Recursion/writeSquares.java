//  Write a method writeSquares that accepts an integer parameter n and prints the 
//  first n squares separated by commas, with the odd squares in descending order 
//  followed by the even squares in ascending order.

public static void writeSquares(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    } else if (n == 1) {
        System.out.print("1");
    } else if (n % 2 != 0) {
        System.out.print(n * n + ", ");
        writeSquares(n - 1);
    } else if (n % 2 == 0) {
        writeSquares(n - 1);
        System.out.print(", " + n * n);
    }
}
