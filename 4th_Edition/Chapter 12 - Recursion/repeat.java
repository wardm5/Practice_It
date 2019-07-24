//  Write a recursive method repeat that accepts a string s and an integer n as parameters 
//  and that returns a String consisting of n copies of s.

public static String repeat(String s, int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    } else if (n== 0) {
        return "";
    } else if (n== 1) {
        return s;
    } else {
        return s + repeat(s, n - 1);
    }
}
