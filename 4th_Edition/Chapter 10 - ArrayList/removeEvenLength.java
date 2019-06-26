//  Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of the strings of even length from the list.

void removeEvenLength(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).length() % 2 == 0) {
            list.remove(i);
            i--;
        } 
    }
}
