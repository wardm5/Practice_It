// Write a method called printReverse that accepts a String as its parameter and prints the characters in opposite order.

public void printReverse(String a) {
    for (int i = a.length() - 1; i >= 0; i--) {
        System.out.print(a.charAt(i));
    }
}
