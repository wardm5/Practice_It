//  Write a method called printPowersOf2 that accepts a maximum number as an argument and prints each power of 2 from 20 (1) up to that maximum power, inclusive. 

void printPowersOf2(int num) {
    int curr = 1 ;
    if (num <= 0) {
        System.out.print(1);
        return;
    } else if ( num > 0) {
        System.out.print(1 + " ");
    }
    for (int i = 1; i <= num; i++) {
        System.out.print(curr * 2 + " ");
        curr = curr * 2;
    }
}
