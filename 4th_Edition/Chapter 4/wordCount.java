//  Write a method called wordCount that accepts a String as its parameter and returns the number of words in the String.

public int wordCount(String str) {
    if (str.length() == 1) {
        return 0;
    }
    return str.trim().split("\\s+").length;
}
