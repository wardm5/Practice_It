/*
    Write a method named binaryZeros that accepts an integer n as a parameter and returns the number of zeros that occur in 
    the binary representation of n. For example, the call of binaryZeros(44) returns 3 because the binary representation of 
    44 is 101100, which contains three zeros. You may assume that n is non-negative.
 */

public int binaryZeros(int n) {
    if (n == 0)
        return 1;
    //     32   16   8   4   2    1
    // 44 = 1    0   1   1   0    0
    String binaryStr = "";
    int temp = n;
    int count = 0;
    String binaryNum = "";
    while (temp/2 > 0) {
        if (temp % 2 == 0) {
            count++;
        } 
        temp = temp / 2; 
    }
    return count;
}
