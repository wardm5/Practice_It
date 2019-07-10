/*
    Write a method removeTens that accepts a List of integers as a parameter and that removes all of the integers 
    that are multiples of 10 from the list. For example, if the list [50, 2, 580, 60, 19, -4, -30] is passed, your 
    code should change the list to be [2, 19, -4].
 */

public void removeTens(List<Integer> list) {
    for (int i = 0 ; i < list.size(); i++) {
        if (list.get(i) % 10 == 0) {
            list.remove(i);
            i--;
        }
    }
}
