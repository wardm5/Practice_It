//  Write a method writeNums that accepts an integer parameter n and prints the first 
//  n integers starting with 1 in sequential order, separated by commas. 

public void writeNums(int n) {
    if (n <= 0) {
        throw new IllegalArgumentException();
    }
    if (n == 1) {
        System.out.println(n);
        return;
    }
    writeNumsHelper(n - 1);
    System.out.print(n);
}
public void writeNumsHelper(int n) {
    if (n == 1) {
//       System.out.println(n + ", ");
    } else {
        writeNumsHelper(n - 1);
    }
    System.out.print(n + ", ");
}
