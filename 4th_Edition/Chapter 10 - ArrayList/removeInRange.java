//  Write a method called removeInRange that accepts four parameters: an ArrayList of integers, an element value, a starting index, and an ending index. 

public void removeInRange(ArrayList<Integer> list, int value, int start, int end) {
    for (int i = start; i < end; i++ ) {
        if (list.get(i) == value) {
            list.remove(i);
            i--;
            end--;
        }
    }
}
