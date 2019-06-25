//  Write a method called printRange that accepts two integers as arguments and prints the sequence of numbers between the two arguments, separated by spaces. 

public void printRange(int a, int b) {
    if(a <= b) {
         for (int i = a; i <= b; i++) {
             System.out.print(i + " ");
         }
    } else {
         for (int i = a; i >= b; i--) {
             System.out.print(i + " ");
         }
    }
}
