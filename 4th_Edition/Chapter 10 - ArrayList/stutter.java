//  Write a method stutter that takes an ArrayList of Strings and an integer k as parameters and that replaces every string with k copies of that string. 

void stutter(ArrayList<String> list, int k) {
    if (k <= 0) {   // if k is 0, then clear the list...
        list.clear();
        return;
    }
    if (k == 1) {  // if k is 1, return the item
        return;
    }
    for (int i = 0; i < list.size(); i++) {   // else if k is greater, for all items in the list
        for (int j = 1; j < k; j++) {  // repeat the item k amount of times
            list.add(i, list.get(i));  // input the value where the index i is set
            i++;                       // increment i for each added value
        }
    }
}
