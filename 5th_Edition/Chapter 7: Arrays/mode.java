public int mode(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int maxFreq = 0;
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        if (map.get(arr[i]) > maxFreq) {
            maxFreq = map.get(arr[i]);
            res = arr[i];
        }
    }
    return res;
}
