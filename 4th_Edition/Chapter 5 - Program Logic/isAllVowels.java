//  Write a method named isAllVowels that returns whether a String consists entirely of vowels (a, e, i, o, or u, case-insensitively).
public boolean isAllVowels(String str) {
//    str = str.toLowerCase();
    for (int i = 0 ; i < str.length(); i++) {
        char temp = str.charAt(i);
        temp = Character.toLowerCase(temp);
        if (temp != 'a' && temp != 'e' && temp != 'i' && temp != 'o' & temp != 'u') {
            return false;
        }
    }
    return true;
}
