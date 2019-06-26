//  Write a method markLength4 that takes an ArrayList of Strings as a parameter and that places a string of four asterisks "****" in front of every string of length 4.

public void markLength4 (ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).length() == 4) {
            list.add(i, "****");
            i++;
        }
    }
}
