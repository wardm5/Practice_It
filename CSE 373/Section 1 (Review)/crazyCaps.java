/*
    Write a method named crazyCaps that accepts a string as a parameter and returns that string with the capitalization 
    altered such that the even letters are all in lowercase and odd letters are all in uppercase. Note that non-alphabetic 
    characters do not count as letters. For example, the call of crazyCaps("Hey!! THERE!") should return "hEy!! ThErE!".
 */

public String crazyCaps(String str) {
    String result = str.toLowerCase();
    StringBuilder s = new StringBuilder();
    int count = 1;
    for (int i = 0; i < str.length(); i++) {
        char temp = str.charAt(i);
        temp = Character.toLowerCase(temp);
        if (Character.isLetter(temp)) {
            if (count % 2 == 0) {
                temp = Character.toUpperCase(str.charAt(i));
                s.append(temp);
            } else {
                s.append(temp);
            }
            count++;
        } else {
            s.append(str.charAt(i));
        }
     }
    return s.toString();
}
