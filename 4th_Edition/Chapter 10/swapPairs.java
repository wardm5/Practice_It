//  Write a method swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion. 

public ArrayList<String> swapPairs(ArrayList<String> arr) {
    int size = arr.size();
    int count = 0;
    while (count < size) {
        if(count + 1 < size) {
            String temp = arr.get(count);
            arr.set(count, arr.get(count+1));
            arr.set(count+1, temp);
        }
        count = count + 2;
    }
    return arr;
}
