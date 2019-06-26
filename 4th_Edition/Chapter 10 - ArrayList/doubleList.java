//  Write a method doubleList that takes an ArrayList of Strings as a parameter and that replaces every string with two of that string.

void doubleList(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
        list.add(i, list.get(i));
        i++;
        if (i > list.size()) {
            break;
        }
    }
}
