// O(nlog(n)) solution
//public int median(int[] arr) {
//    Arrays.sort(arr);
//    return arr[arr.length / 2];
//}
// O(n) solution
public int median(int[] arr) {
    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < arr.length; i++) {
        set.add(arr[i]);
    }
    int size = set.size();
    int i = 0; 
    for (int temp : set) {
        if (size % 2 == 0 && i == size/2-1)
            return temp;
        if (i == size/2)
            return temp;
        i++;
    }
    return -1;
}
