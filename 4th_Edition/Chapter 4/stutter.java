//  Write a method called stutter that accepts a parameter and returns the String with its characters returns repeated twice. 

public String stutter(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0 ; i < str.length(); i++) {
        char temp = str.charAt(i);
        result.append(temp).append(temp);
    }
    return result.toString();
}
