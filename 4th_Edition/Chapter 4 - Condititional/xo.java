/**
  *   Write a static method named xo that accepts an integer size as a parameter and prints a square of 
  *   size by size characters, where all characters are "o" except that an "x" pattern of "x" characters 
  *   has been drawn from the corners of the square.
  */

public static void xo(int size) {
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (i == j || j == size - 1 - i) {
                System.out.print("x");
            } else {
                System.out.print("o");
            }
        }
        System.out.println();
    }
}
