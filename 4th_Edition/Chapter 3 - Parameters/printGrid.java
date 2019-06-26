//  Write a method named printGrid that accepts two integer parameters rows and cols.

public void printGrid(int row, int col) {
    int column = 1;
    int val = 0;
    for (int i = 0; i < row; i++) {
        val = column;
        for ( int j = 0; j < col - 1; j++) {
            System.out.print(val + ", ");
            val += row;
        }
        System.out.println(val);
        column++;
    }
}
