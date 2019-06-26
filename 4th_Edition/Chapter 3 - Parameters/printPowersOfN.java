//  Write a method called printPowersOfN that accepts a base and an exponent as arguments and prints each power of the base from base0 (1) up to that maximum power, inclusive.

void printPowersOfN(int val, int num) {
    if (num <=0) {
        System.out.print(1);
    } else if ( num >= 1) {
        System.out.print(1 + " ");
    }
    int curr = 1;
    for (int i = 1; i <= num; i++) {
        System.out.print(curr * val + " ");
        curr = curr * val;
    }
}
