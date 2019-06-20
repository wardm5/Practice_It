//  Negates and swaps the x/y coordinates of the Point object.

public void flip() {
    int temp = -y;
    y = -x;
    x = temp;
}
