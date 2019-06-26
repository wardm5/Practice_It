//  Write a method called printNumbers that accepts a maximum number as a parameter and prints each number from 1 up to that maximum, inclusive, boxed by square brackets. 

void printNumbers(int num) {
    for (int i = 1; i <= num; i++) {
        System.out.print("[" + i + "] ");
    }
}
