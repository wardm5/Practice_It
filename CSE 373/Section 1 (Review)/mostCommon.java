public String mostCommon(String s) {
    HashMap<String, Integer> map = new HashMap<>();
    s = s.trim();
    String[] arr = s.split("[ ]+");
    String res = "";
    int max = 0;
    for (int i = 0 ; i < arr.length; i++) {
        int temp = (map.getOrDefault(arr[i], 0) + 1);
        map.put(arr[i], temp);
        if (temp > max){
            max = temp;
            res = arr[i];
        }
    }
    return res;
}
