//  Write a method called printSquare that takes in two integer parameters, a min and a max, and prints the numbers in the range from min to max inclusive in a square pattern. 

void printSquare (int min, int max) {
    int x = min;
    for (int i = min; i <= max; i++) {
        x = i;
        for (int j = min; j <= max; j++) {
            if (x > max) {
                x = min;
                System.out.print(x);
                x = x + 1;
            } else {
                System.out.print(x);
                x = x + 1;
            }
        }
        System.out.println();
    } 
}
