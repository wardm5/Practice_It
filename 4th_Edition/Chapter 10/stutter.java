//  Write a method stutter that takes an ArrayList of Strings and an integer k as parameters and that replaces every string with k copies of that string. 

void stutter(ArrayList<String> list, int k) {
    if (k <= 0) {
        list.clear();
        return;
    }
    if (k == 1) {
        return;
    }
    for (int i = 0; i < list.size(); i++) {
        for (int j = 1; j < k; j++) {
            list.add(i, list.get(i));
            i++;
        }
    }
}
