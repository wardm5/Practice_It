/*
    Write a method contains3 that accepts a List of strings as a parameter and returns true if any single string 
    occurs at least 3 times in the list, and false otherwise. Use a map as auxiliary storage.
 */

public boolean contains3(List<String> list) {
    int count = 0;
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i <list.size(); i++) {
        String tempStr = list.get(i);
        if (map.containsKey(list.get(i))) {
            int tempCount = map.get(tempStr);
            tempCount++;
            if (tempCount == 3)
                return true;
            map.put(tempStr, tempCount);
        } else{
            map.put(tempStr, 1);
        }
    }
    return false;
}
