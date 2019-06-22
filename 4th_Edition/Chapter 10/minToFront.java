//  Write a method minToFront that takes an ArrayList of integers as a parameter and that moves the minimum value in the list to the front, otherwise preserving the order of the elements. 

public static void minToFront ( ArrayList<Integer> list) {
    if (list.size() <= 1)
        return;
    int min = Integer.MAX_VALUE;
    int position = 0; 
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) < min) {
            position = i;
            min = list.get(i);
        }
    }
    list.remove(position);
    list.add(0, min);
}
