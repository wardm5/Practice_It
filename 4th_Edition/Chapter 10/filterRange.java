//  Write a method filterRange that accepts an ArrayList of integers and two integer values min and max as parameters and removes all elements whose values are in the range min through max (inclusive) from the list.

void filterRange (ArrayList<Integer> list, int min, int max) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) >= min && list.get(i) <= max) {
            list.remove(i);
            i--;
        }
    }
}
